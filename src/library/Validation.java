package library;

import entity.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Validation
{
	public static boolean isValidEmail(String email)
	{
		boolean b;
			String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
			b = email.matches(emailregex);
			
			
			if (b == true)
				return true; 
             	
		
		
		
		return false;

	}

	public static boolean isValidPhoneLength(long phone)
	{	
		int count=0;
		while(phone>0)
		{
			phone/=10;
			count++;
		}

		if(count==10)
			return true;
		else
			return false;

	}
        
        public static boolean isValidPhoneNo(long phone)
	{	
            //Employee emp=null;
            ResultSet rs=null;
            int result=0;
            String sql="select phone from employee32 where phone="+phone;
		try{
                Connection conn=DBConnectionFactory.connectionFactory.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql);
                rs=ps.executeQuery();
                System.out.println("rs"+rs);
                while(rs.next())
                {
                 result=rs.getInt(1);   
                System.out.println(result);
                if(result==0)
			return true;
                }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
                
	return false;

	}
        
        public static boolean isValidEmailId(String email)
        {
        //Employee emp=null;
            ResultSet rs=null;
            String sql="select * from employee32 where email='"+email+"'";
		try{
                Connection conn=DBConnectionFactory.connectionFactory.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next())
                {
                    System.out.println(rs.getString(2));
                    if(rs.getString(2)==null)
			return true;
                }
            
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
                
		return false;

        
        }
        
        public static boolean isValidEmployee(int id)
        {
            Employee emp=null;
            try {
                emp=Employee.searchByID(id);
                
            } catch (Exception ex) {
                Logger.getLogger(Validation.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(emp.getName()!=null)
                return false;
            else
                return true;
        }
        
        


}