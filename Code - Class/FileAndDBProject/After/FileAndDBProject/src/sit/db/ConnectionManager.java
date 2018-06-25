/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.db;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import  org.apache.derby.jdbc.*;

public class ConnectionManager {
    
    public static Connection createConnection (String fileName) 
            throws FileNotFoundException, IOException, SQLException{
        Properties props=new Properties();
        props.load(new FileReader(fileName));
        String serverName=props.getProperty("SERVER_NAME");
        String serverPort=props.getProperty("SERVER_PORT");
        String dbName=props.getProperty("DB_NAME");
        String dbUser=props.getProperty("DB_USER");
        String dbPassword=props.getProperty("DB_PASSWORD");
        ClientDataSource ds=new ClientDataSource();
        ds.setServerName(serverName);
        ds.setPortNumber(Integer.parseInt(serverPort));
        ds.setDatabaseName(dbName);
        ds.setUser(dbUser);
        ds.setPassword(dbPassword);
        Connection cn=ds.getConnection();
        return cn;
        
    } 
            
    public static Connection createConnection 
        (String url, String username, String psw) 
                throws ClassNotFoundException, SQLException{
            //option for register driver name to DriverManager
           // Class.forName("org.apache.derby.jdbc.EmbeddedDriver");                       
            Connection cn=DriverManager.getConnection(url, username, psw);
            
            return cn;
            
    }
        
    public static Connection createConnection 
        (String url, Properties props) 
                throws SQLException{       
        Connection cn=DriverManager.getConnection(url, props);
        return cn;
    }    
      
        
    public static void closeConnection(Connection cn)
            throws SQLException{
        cn.close();
    }    
        
}
