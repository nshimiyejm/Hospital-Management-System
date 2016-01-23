/*
 * The main purpose of this class is to create a connection to the database for 
 * All the users that have permission. The users will be able to change and pull 
 * Need data and this data will later on used for descision making and reporting
 */
package MainApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

/**
 *
 * @author Jean-Marie
 */
public class MySQLConnect {
    
    //Creating attributes that will help establish the connection 
    
    // The user name and the password are going to be entered by the user 
    // These Two variables will later on be compared to the values contained in 
    // The database for validation. 
    
    private String userN;
    private String passW;
    
    // Creating a constructor that has two parameters 
            
    public MySQLConnect(String u, String p){
    
        userN = u;
        passW = p;
        
    }
            
    public static void main(String[] args) throws Exception{
        
        //Creating Connection to the database 
        Connection conn = getConnection();
        Statement st = conn.createStatement();
        
         // st.executeUpdate("drop table survey;");
        // st.executeUpdate("create table survey (id int,name varchar(30));");
        // st.executeUpdate("insert into survey (id,name ) values (1,'nameValue')");

         st = conn.createStatement();
         ResultSet rs = st.executeQuery("SELECT * FROM students");

         ResultSetMetaData rsMetaData = rs.getMetaData();

         int numberOfColumns = rsMetaData.getColumnCount();
         System.out.println("resultSet MetaData column Count=" + numberOfColumns);

         st.close();
         conn.close();
        
    
    }
    
    public static Connection getConnection() throws Exception{
    
     String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
     String url = "jdbc:mysql://localhost:3306/health_management_system?zeroDateTimeBehavior=convertToNull";
     
     
     String username = "";
     String password = "";
     Class.forName(driver);
     
        return DriverManager.getConnection(url, username, password);
    }
    
    
    
    public void setUser(String u)
    {
        userN = u;
    }
    
    public void setPass(String p)
    {
        passW = p;
    }
    
    public String getUser(){
    return userN;
    }

    public String getPass(){
    return passW;
    }

  
}
