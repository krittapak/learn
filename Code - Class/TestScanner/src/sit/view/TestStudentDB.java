/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import sit.controller.StudentController;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class TestStudentDB {

    public static void main(String[] args) {

        try {
          
            // StudentController stdCtrl = new StudentController("sit", "sit");
            Properties dbPros=new Properties();
            dbPros.setProperty("user", "sit");
            dbPros.setProperty("password", "sit");
            StudentController stdCtrl=new StudentController(dbPros);
//            int recs=stdCtrl.deleteAllStudent();
//            System.out.println("deleted "+recs+" records");
            int recs=stdCtrl.insertStudent(new Student(99,"Booof","try"));
            System.out.println("Inserted "+recs+" records");
            stdCtrl.close();
        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);

        }

    }
}
