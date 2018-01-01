/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package library;

import entity.Employee;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author squad
 */
public class DBModel {
    
    public static Object[] objectToArray(Object obj)
    {
        Object[] row=null;
        if(obj instanceof Employee)
        {
            row=new Object[12];
            Employee emp=(Employee) obj;
            
            row[0]=emp.getId();
            row[1]=emp.getName();
            row[2]=emp.getEmail();
            row[3]=emp.getPhone();
            row[4]=emp.getGender();
            row[5]=emp.getDepartmentName();
            row[6]=emp.getProjectName();
            row[7]=emp.getDob();
            row[8]=emp.getAddress();
            row[9]=emp.getDoj();
            row[10]=emp.getSalary();
            row[11]=emp.getImage();
           
            
        }
        
        else if(obj instanceof FeedBack)
        {
            row=new Object[2];
            FeedBack feedback=(FeedBack) obj;
            row[0]=feedback.getName();
            row[1]=feedback.getMessage();
        }
        return row;
    }
    
    public static void rahulModel(JTable table,Object obj)
    {
        
       if(obj instanceof Employee)
       {
        Object[] columns={"Id", "Name", "Email", "Phone", "Gender", "Department", "Project", "DOB", "Address", "DOJ", "Salary","Image"};
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        
        Object[] row=objectToArray(obj);
        model.addRow(row);
       }
       
       if(obj instanceof FeedBack)
       {
        Object[] columns={"Name","Message"};
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        
        Object[] row=objectToArray(obj);
        model.addRow(row);
       }
    }
    
    public static void rahulModel(JTable table,ArrayList<Employee> arrayList)
    {
        Object[] columns={"Id", "Name", "Email", "Phone", "Gender", "Department", "Project", "DOB", "Address", "DOJ", "Salary","Image"};
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        
        for(Employee emp : arrayList)
        {
            Object[] row=objectToArray(emp);
            model.addRow(row);
                }
        
        
        
    }
    
     public static void rahulModel1(JTable table,ArrayList<FeedBack> arrayList)
     {
         Object[] columns={"Name","Message"};
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        
        for(FeedBack feed : arrayList)
        {
            Object[] row=objectToArray(feed);
            model.addRow(row);
        }   
     }
    
}
