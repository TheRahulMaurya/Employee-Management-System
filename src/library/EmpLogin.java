/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author squad
 */
public class EmpLogin {
    private int id;
    private String pass;

    public EmpLogin() {
    }
    
    

    public EmpLogin(int id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    
        
    public boolean savelogin()
    {
        String sql="insert into login values(?,?)";
        int result=0;
        try(
                Connection conn=DBConnectionFactory.connectionFactory.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql))
         {
             ps.setInt(1,this.id);
             ps.setString(2,this.pass);
             result = ps.executeUpdate();
             
          }catch(SQLException e){
            System.out.println(e.getMessage());
          }
        if(result!=0)
            return true;
        else
            return false;
    }
    
    public static EmpLogin getLogin(int id)
    {
        EmpLogin elogin=new EmpLogin();
        String sql="select * from login where id="+id;
        
        try(
                Connection conn=DBConnectionFactory.connectionFactory.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql);
                ResultSet rs=ps.executeQuery())
        {
            while(rs.next()){
                
                elogin.id=rs.getInt(1);
                elogin.pass=rs.getString(2);

                
            }
            
            return elogin;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            
        }
        
        return elogin;
    }
    
}
