/*
 * The main purpose of this class is to create a connection to the database for 
 * All the users that have permission. The users will be able to change and pull 
 * Need data and this data will later on used for descision making and reporting
 */
package MainApplication;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jean-Marie
 */
public class MySQLConnect {
    Connection conn = null;
    
    public static Conncection ConnectDb(){
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Conncetion conn = DriverManager.getConnection("jdbc:mysql://Localhost/health_management_system","root","root");
            
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
            
    }
    
}
