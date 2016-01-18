/*
 * The main purpose of this class is to create a connection to the database for 
 * All the users that have permission. The users will be able to change and pull 
 * Need data and this data will later on used for descision making and reporting
 */
package MainApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author Jean-Marie
 */
public class MySQLConnect {
    public static void main(String[] args){
        
        try{
            String host = "jdbc:mysql://localhost:3306/health_management_system";
            String uName = "root";
            String uPass = "";


            Conncetion conn = DriverManager.getConnection(host, uName, uPass);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
            
        }
    
    }
  
}
