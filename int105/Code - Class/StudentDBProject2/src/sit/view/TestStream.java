/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class TestStream {

    public static void main(String[] args) throws ClassNotFoundException {

        FileInputStream fis = null;
        ObjectInputStream dis = null;

        try {
            fis = new FileInputStream("student-object.dat");
            dis = new ObjectInputStream(fis);
//        FileInputStream fis = new FileInputStream("student.dat");
//        DataInputStream dis = new DataInputStream(fis);
            while (true) {
                Object temp=dis.readObject();
                Student std=(Student)temp;
                System.out.println(std);
            }
        } catch (EOFException eof) {
            try {
                dis.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
