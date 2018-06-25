/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JTextField;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class ButtonListener implements ActionListener {

    private JTextField txtStdId;
    private JTextField txtStdFirstName;
    private JTextField txtStdLastName;

    public ButtonListener(JTextField txtStdId, JTextField txtStdFirstName, JTextField txtStdLastName) {
        this.txtStdId = txtStdId;
        this.txtStdFirstName = txtStdFirstName;
        this.txtStdLastName = txtStdLastName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnCommand = e.getActionCommand();

        if (btnCommand.equalsIgnoreCase("Reset")) {
            System.out.println("Reset...");
            reset();
        } else if (btnCommand.equalsIgnoreCase("Save")) {
            System.out.println("Save...");
            save();
            
        } else if (btnCommand.equalsIgnoreCase("Save As Object")) {
            System.out.println("Save As ...");
        }
    }
    public void save(){
        try{
        FileOutputStream fos = new FileOutputStream("student.dat",true);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(Integer.parseInt(txtStdId.getText()));
        dos.writeUTF(txtStdFirstName.getText());
        dos.writeUTF(txtStdLastName.getText());
        dos.close();
        }
        catch(FileNotFoundException fnf){
            System.out.println(fnf);
        }
        catch(IOException io){
            System.out.println(io);
        }
    }
     public void saveAs(){
        try{
        FileOutputStream fos = new FileOutputStream("student-object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        int stdId = Integer.parseInt(txtStdId.getText());
        String stdFirstName = txtStdFirstName.getText();
        String stdLastName = txtStdLastName.getText();
        Student std = new Student(stdId, stdFirstName, stdLastName);
        oos.writeObject(std);
        oos.close();
        }
        catch(FileNotFoundException fnf){
            System.out.println(fnf);
        }
        catch(IOException io){
            System.out.println(io);
        }
    }
    public void reset(){
        this.txtStdFirstName.setText("");
        this.txtStdLastName.setText("");
        this.txtStdId.setText("");
    }

}
//        oos.writeInt(Integer.parseInt(txtStdId.getText()));
//        oos.writeUTF(txtStdFirstName.getText());
//        oos.writeUTF(txtStdLastName.getText());