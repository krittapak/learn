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
import sit.controller.StudentController;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class TestStudentDB {
    public static void main(String[] args) {
        try{
           String file="dbProperties.txt";
           StudentController stdCtrl=new StudentController(file);                       
           int recs=stdCtrl.insertStudentFromFile("studentList.txt");
           System.out.println(recs+" inserted records");
           /*ArrayList<Student> list=
                   stdCtrl.executeSQLCommand("select * from student "
                           + "where lastname='Do'");*/
/*ArrayList<Student> list=
stdCtrl.executeSQLCommand("update student set firstname='James' "
          + "where stdId=1005");
           if(list!=null){
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));                
                }
           }*/
           
            stdCtrl.close();
        }
       
        catch(SQLException sqlEx){
            System.out.println(sqlEx);
        }
        catch(IOException sqlEx){
            System.out.println(sqlEx);
        }
    }
}
  //StudentController stdCtrl=new StudentController("sit", "sit");
           /* Properties dbPros=new Properties();
            dbPros.setProperty("user", "sit");
            dbPros.setProperty("password", "sit");
            StudentController stdCtrl=new StudentController(dbPros);
            int rec=stdCtrl.insertStudent(new Student(99, "James", "Bonds"));
            System.out.println("inserted "+rec+" record");            
            stdCtrl.close();
            /*int recs=stdCtrl.deleteAllStudents();
            System.out.println("deleted "+recs+" records");*/