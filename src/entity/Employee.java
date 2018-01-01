package entity;

import library.*;
import java.sql.*;
import java.util.*;

public class Employee implements Comparable<Employee> 
{
    private String name,email,dob,doj,gender;
    private int id;
    private long phone;
    private Address address=new Address();
    private Salary salary=new Salary();
    private Department department=new Department();
    private Project project=new Project();
    private byte[] image;

    
    
    public Employee()
    {
    }
    
    public Employee(int id,String name,String email,long phone,String gender,String departmentName,String projectName,String doj,String address,String dob,int salary,byte[] image) throws Exception
    {
                
            this.id=id;
            this.name=name;
            if(Validation.isValidEmail(email))
                this.email=email;
            else
                throw new InvalidEmailException("Invalid Email!!");
            
            if(Validation.isValidPhoneLength(phone))
                this.phone=phone;
            else
                throw new InvalidPhoneException("Invalid Phone number!!");
            
            
            this.department.setDepartmentName(departmentName);
            this.project.setProjectName(projectName);
            
            this.dob=dob;
            this.doj=doj;
            this.address.setCity(address);
            this.salary.setSalary(salary);
            this.gender=gender;
            this.image=image;
        
        
    }
    
    
    public int getId()
    {
        return this.id;
    }
    
    public long getPhone()
    {
        return phone;
    }
    
    public String getDob() {
        return dob;
    }
    
    public String getDoj() {
        return doj;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public void setDoj(String doj) {
        this.doj = doj;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
    public void setPhone(int phone) throws Exception
    {
            if(Validation.isValidPhoneLength(phone))
                this.phone=phone;
            else
                throw new InvalidPhoneException("Invalid Phone number!!");
        
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getDepartmentName()
    {
        return department.getDepartmentName();
    }
    
    public void setDepartmentName(String departmentName)
    {
        this.department.setDepartmentName(departmentName);
    }
    
    public String getProjectName()
    {
        return project.getProjectName();
    }
    
    public void setProjectName(String projectName)
    {
        this.project.setProjectName(projectName);
    }
    
    public int getSalary()
    {
        return salary.getSalary();
    }
    
    public String getAddress()
    {
        return address.getCity();
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
    
    public int compareTo(Employee emp)
    {
        if(this.id< emp.id)
            return -1;
        else if(this.id== emp.id)
            return 0;
        else
            return 1;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void setEmail(String email) throws Exception
    {

            if(Validation.isValidEmail(email))
                this.email=email;
            else
                throw new InvalidEmailException("Invalid Email!!");
      
        
        
    }
    
    public boolean saveToDB() throws Exception
    {
        
        String sql="insert all into employee32 values(?,?,?,?,?,?,?,?,?,?,?)"+
                " into work_on values(?,(select p_id from project32 where pname=?)) select * from dual";
        
        try(
                Connection conn=DBConnectionFactory.connectionFactory.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql)
                )
        {
            ps.setInt(1,this.id);
            ps.setString(2,this.name);
            ps.setString(3,this.email);
            ps.setLong(4,this.phone);
            ps.setString(5,this.gender);
            ps.setString(6,this.department.getDepartmentName());
            ps.setString(7,this.dob);
            
            ps.setString(8,this.address.getCity());
            ps.setString(9,this.doj);
            
            ps.setInt(10,this.salary.getSalary());
            ps.setBytes(11,this.image);
            ps.setInt(12,this.id);
            ps.setString(13,this.project.getProjectName());

            int result=ps.executeUpdate();
            if(result!=0)
                return true;
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            
        }
       
        return false;
    }
    
    public boolean deleteFromDB() throws Exception
    {
        
        String sql="delete from employee32 where emp_id = ?";
        
        try(
                Connection conn=DBConnectionFactory.connectionFactory.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql)
                )
        {
            ps.setInt(1,this.id);
            
            int result=ps.executeUpdate();
            if(result!=0)
                return true;
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            
        }
       
        return false;
        
    }
    
    
    public boolean updateDB() throws Exception
    {
        String sql="update employee32 set name=?,email=?,phone=?,gender=?,department=?,dob=?,address=?,doj=?,salary=?,image=? where emp_id = ?";
        try(
                Connection conn=DBConnectionFactory.connectionFactory.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql))
            
        {
            ps.setString(1,this.name);
            ps.setString(2,this.email);
            ps.setLong(3,this.phone);
            ps.setString(4,this.gender);
            ps.setString(5,this.department.getDepartmentName());
            ps.setString(6,this.dob);
            ps.setString(7,this.address.getCity());
            ps.setString(8,this.doj);
            ps.setInt(9,this.salary.getSalary());
            ps.setBytes(10,this.image);
            ps.setInt(11,this.id);

            int result1 = ps.executeUpdate();
            CallableStatement stmt=conn.prepareCall("{call update_employee32(?,?)}"); 
            stmt.setInt(1,this.id);
            stmt.setString(2,this.project.getProjectName());
            boolean result2 = stmt.execute();
            
            if(result1!=0 && result2==true)
                return true;
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            
        }
        
        return false;
    }
    
    
    public static Employee searchByID(int employeeID) throws Exception
    {
        String sql="select e.emp_id,e.name,e.email,e.phone,e.gender,e.department,p.pname,e.dob,e.address,e.doj,e.salary,e.image"+
                " from employee32 e join work_on w on e.emp_id=w.emp_id"+
                " join project32 p on w.p_id=p.p_id where e.emp_id ="+employeeID;
        Employee employee=new Employee();
        try(
                Connection conn=DBConnectionFactory.connectionFactory.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql);
                ResultSet rs=ps.executeQuery())
        {
            
            
            
            while(rs.next())
            {
                
                employee.id=rs.getInt(1);
                employee.name=rs.getString(2);
                employee.email=rs.getString(3);
                employee.phone=rs.getLong(4);
                employee.gender=rs.getString(5);
                employee.department.setDepartmentName(rs.getString(6));
                employee.project.setProjectName(rs.getString(7));
                employee.dob=rs.getString(8);
                employee.address.setCity(rs.getString(9));
                employee.doj=rs.getString(10);
                employee.salary.setSalary(rs.getInt(11));
                employee.image=rs.getBytes(12);
            }
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            
        }
        
        return employee;
        
    }
    
    public static ArrayList<Employee> searchByName(String name) throws Exception
    {
        
        ArrayList<Employee> arrayList=new ArrayList<Employee>();
        String sql="select e.emp_id,e.name,e.email,e.phone,e.gender,e.department,p.pname,e.dob,e.address,e.doj,e.salary,e.image"+
                " from employee32 e join work_on w on e.emp_id=w.emp_id"+
                " join project32 p on w.p_id=p.p_id where e.name='"+name+"'";
        
        try(
                Connection conn=DBConnectionFactory.connectionFactory.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql);
                ResultSet rs=ps.executeQuery())
        {
            while(rs.next()){
                Employee employee=new Employee();
                employee.id=rs.getInt(1);
                employee.name=rs.getString(2);
                employee.email=rs.getString(3);
                employee.phone=rs.getLong(4);
                employee.gender=rs.getString(5);
                employee.department.setDepartmentName(rs.getString(6));
                employee.project.setProjectName(rs.getString(7));
                employee.dob=rs.getString(8);
                employee.address.setCity(rs.getString(9));
                employee.doj=rs.getString(10);
                employee.salary.setSalary(rs.getInt(11));
                employee.image=rs.getBytes(12);
                
                arrayList.add(employee);
            }
            
            return arrayList;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            
        }
        
        return arrayList;
        
    }
    
    
    
    public static ArrayList<Employee> searchByProject(String projectName) throws Exception
    {
        
        ArrayList<Employee> arrayList=new ArrayList<Employee>();
        String sql="select e.emp_id,e.name,e.email,e.phone,e.gender,e.department,p.pname,e.dob,e.address,e.doj,e.salary,e.image"+
                " from employee32 e join work_on w on e.emp_id=w.emp_id"+
                " join project32 p on w.p_id=p.p_id where p.pname='"+projectName+"'";
        
        
        try(
                Connection conn=DBConnectionFactory.connectionFactory.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql);
                ResultSet rs=ps.executeQuery())
        {
            while(rs.next()){
                Employee employee=new Employee();
                employee.id=rs.getInt(1);
                employee.name=rs.getString(2);
                employee.email=rs.getString(3);
                employee.phone=rs.getLong(4);
                employee.gender=rs.getString(5);
                employee.department.setDepartmentName(rs.getString(6));
                employee.project.setProjectName(rs.getString(7));
                employee.dob=rs.getString(8);
                employee.address.setCity(rs.getString(9));
                employee.doj=rs.getString(10);
                employee.salary.setSalary(rs.getInt(11));
                employee.image=rs.getBytes(12);
                
                arrayList.add(employee);
            }
            
            return arrayList;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            
        }
        
        return arrayList;
        
    }
    
    
    
    
    public static ArrayList<Employee> showAllEmployee() throws Exception
    {
        
        ArrayList<Employee> arrayList=new ArrayList<Employee>();
        String sql="select e.emp_id,e.name,e.email,e.phone,e.gender,e.department,p.pname,e.dob,e.address,e.doj,e.salary,e.image"+
                " from employee32 e join work_on w on e.emp_id=w.emp_id"+
                " join project32 p on w.p_id=p.p_id order by e.emp_id asc";
        
        
        try(
                Connection conn=DBConnectionFactory.connectionFactory.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql);
                ResultSet rs=ps.executeQuery())
        {
            
            while(rs.next()){
                Employee employee=new Employee();
                employee.id=rs.getInt(1);
                employee.name=rs.getString(2);
                employee.email=rs.getString(3);
                employee.phone=rs.getLong(4);
                employee.gender=rs.getString(5);
                employee.department.setDepartmentName(rs.getString(6));
                employee.project.setProjectName(rs.getString(7));
                employee.dob=rs.getString(8);
                employee.address.setCity(rs.getString(9));
                employee.doj=rs.getString(10);
                employee.salary.setSalary(rs.getInt(11));
                employee.image=rs.getBytes(12);
                
                arrayList.add(employee);
            }
            
            return arrayList;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            
        }
        
        return arrayList;
        
    }
    
}


