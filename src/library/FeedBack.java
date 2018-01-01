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
public class FeedBack {
    private String name;
    private String message;

    public FeedBack() {
    }
    
    

    public FeedBack(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public boolean saveFeedBack()
    {
        String sql="insert into feedback values(?,?)";
        int result=0;
        try(
                Connection conn=DBConnectionFactory.connectionFactory.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql))
         {
             ps.setString(1,this.name);
             ps.setString(2,this.message);
             result = ps.executeUpdate();
             
          }catch(SQLException e){
            System.out.println(e.getMessage());
          }
        if(result!=0)
            return true;
        else
            return false;
    }
    
    public static ArrayList<FeedBack> getFeedBack()
    {
        ArrayList<FeedBack> arrayList=new ArrayList<FeedBack>();
        String sql="select * from feedback";
        
        try(
                Connection conn=DBConnectionFactory.connectionFactory.getConnection();
                PreparedStatement ps=conn.prepareStatement(sql);
                ResultSet rs=ps.executeQuery())
        {
            while(rs.next()){
                FeedBack feedback=new FeedBack();

                feedback.name=rs.getString(1);
                feedback.message=rs.getString(2);

                arrayList.add(feedback);
            }
            
            return arrayList;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            
        }
        
        return arrayList;
    }
    
}
