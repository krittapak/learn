/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import sit.db.ConnectionManager;

/**
 *
 * @author INT105
 */
public class StudentController {
    private Connection con;
    
    public void connectStudentDB(String driverClass,String url,String username,String psw)throws ClassNotFoundException,SQLException{
        con=ConnectionManager.createConnection(driverClass, url, username, psw);
        
    }
    public void closeStudentDB() throws SQLException{
        ConnectionManager.closeConnection(con);
    }
    public void selectAllStudent(String sql) throws SQLException{
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getInt("stdId")+" , "+rs.getString("firstname")+" , "+rs.getString("lastname"));
        }
    }
}
