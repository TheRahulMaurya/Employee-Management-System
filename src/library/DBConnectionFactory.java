package library;

import java.util.*;
import java.sql.*;

public class DBConnectionFactory
{
	private Connection conn;
    private ResultSet rs;
    private Statement st;
    //private CallableStatement cs;
    //static final String DB_URL,DRIVER,USERNAME,PASSWORD;
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:xe";
    static final String USERNAME="rahul";
    static final String PASSWORD="mauryadv577";
    static final String DRIVER="oracle.jdbc.driver.OracleDriver";

    public static DBConnectionFactory connectionFactory = new DBConnectionFactory();

    private DBConnectionFactory()
    {
        try{
        Class.forName(DRIVER);
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Driver Not Founnd");
        }

    }

    public Connection getConnection() throws SQLException {
        return conn=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
    }

    public static void closeDBConnection(ResultSet rs, Statement stmt, Connection con){ 
        try { 
            if(rs!=null) {
                rs.close();
                rs =null;
            }
        } 
        catch (SQLException ex) { 
            ex.printStackTrace(); 
        }
        
        try { 
            if(stmt!=null) {
                stmt.close();
                stmt =null;
            }
        } 
        catch (SQLException ex) { 
            ex.printStackTrace(); 
        }
        
        try { 
            if(con!=null) {
                con.close();
                con =null;
            }
        } 
        catch (SQLException ex) { 
            ex.printStackTrace(); 
        }
        
    }     
}

	// public void jdbc()
	// {
	// 	String sql="select * from employee";
 //        try{
 //        // Class.forName(DRIVER);
 //        // conn=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
 //        // if(conn!=null)
 //        //     System.out.println("Connection Stablished!!!");
 //        // else
 //        //     System.out.println("Connection Failed !!");
        
 //        st=conn.createStatement();
 //        rs=st.executeQuery(sql);
 //        while(rs.next())
 //        {
 //            System.out.println(rs.getString(1)+"\n\n"+rs.getString(2)+"\n\n"+rs.getString(3)+"\n\n"+rs.getString(4)+"\n\n");
 //        }
 //        cs=conn.prepareCall("{?=call adder(?,?)}");
 //        cs.registerOutParameter(1,Types.INTEGER);
 //        cs.setInt(2,5);
 //        cs.setInt(3,6);
 //        cs.execute();
 //        returnValue=cs.getInt(1);
 //         conn.close();
 //         System.out.println("Sum is : "+returnValue);
 //        }
 //        catch(ClassNotFoundException e)
 //        {
 //        	System.out.println("Exception : "+e.getMessage());
 //            e.printStackTrace();
 //        }
 //        catch(SQLException e)
 //        {
 //            System.out.println("Exception : "+e.getMessage());
 //            e.printStackTrace();

 //        }
 //        // finally
 //        // {
 //        //     conn.close();
 //        // }
	//}
//} 