/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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
            String file = "dbProperties.txt";
            StudentController stdCtrl = new StudentController(file);
            //stdCtrl.insertStudentFromFile("studentList.txt");
//            int rec = stdCtrl.insertStudentFromFile("studentList.txt");

//            ArrayList<Student> list=stdCtrl.selectStudent();
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i));
//            }
//            stdCtrl.close();
            ArrayList<Student> list = stdCtrl.executeSQLCommand("update student set firstname='James' where id=1005");
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }

            stdCtrl.close();
            //StudentController stdCtrl=new StudentController("sit", "sit");
//            Properties dbPros=new Properties();
//            dbPros.setProperty("user", "sit");
//            dbPros.setProperty("password", "sit");
//            StudentController stdCtrl=new StudentController(dbPros);
//            int rec=stdCtrl.insertStudent(new Student(99, "James", "Bonds"));
//            System.out.println("inserted "+rec+" record");            
//            stdCtrl.close();
            /*int recs=stdCtrl.deleteAllStudents();
            System.out.println("deleted "+recs+" records");*/

        } catch (IOException ex) {
            Logger.getLogger(TestStudentDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestStudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
