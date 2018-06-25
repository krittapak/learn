/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.sql.SQLException;
import java.util.Properties;
import sit.controller.StudentController;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class TestStudentDB {
    public static void main(String[] args) {
        try{
            //StudentController stdCtrl=new StudentController("sit", "sit");
            Properties dbPros=new Properties();
            dbPros.setProperty("user", "sit");
            dbPros.setProperty("password", "sit");
            StudentController stdCtrl=new StudentController(dbPros);
            int rec=stdCtrl.insertStudent(new Student(99, "James", "Bonds"));
            System.out.println("inserted "+rec+" record");            
            stdCtrl.close();
            /*int recs=stdCtrl.deleteAllStudents();
            System.out.println("deleted "+recs+" records");*/
            
        }
        catch(ClassNotFoundException cnfEx){
            System.out.println(cnfEx);
        }
        catch(SQLException sqlEx){
            System.out.println(sqlEx);
        }
        
    }
}
