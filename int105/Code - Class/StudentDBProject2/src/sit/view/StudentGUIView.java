/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import sit.controller.ButtonListener;
import sit.controller.StudentController;
import sit.controller.StudentSelectionListener;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class StudentGUIView {
    private JFrame frameStudent;
    
    private JPanel jpnStudentRecord;
    private JPanel jpnButton;
    private JPanel jpnStudentTable;
    private JPanel jpnStudentLeft;
    
    private JTextField txtStdId;
    private JTextField txtStdFirstName;
    private JTextField txtStdLastName;
    
    private JButton btnSave;
    private JButton btnSaveAs;
    private JButton btnReset;
    
    private JTable tblStudent;
    private JScrollPane scrlStudent;
    
   
    
    public StudentGUIView() throws ClassNotFoundException, IOException, SQLException{
        initGUI();
    }
    public void initGUI() throws ClassNotFoundException, SQLException, IOException{
        frameStudent = new JFrame("Student List");
        
        jpnStudentRecord = new JPanel(new GridLayout(3,2));
        
        jpnStudentRecord.add(new JLabel("Student Id"));
        txtStdId = new JTextField();
        jpnStudentRecord.add(txtStdId);
        
        jpnStudentRecord.add(new JLabel("FirstName"));
        txtStdFirstName = new JTextField();
        jpnStudentRecord.add(txtStdFirstName);
        
        jpnStudentRecord.add(new JLabel("LastName"));
        txtStdLastName = new JTextField();
        jpnStudentRecord.add(txtStdLastName);
        
        jpnButton = new JPanel();
        ButtonListener btnListener = 
                new ButtonListener(txtStdId, txtStdFirstName, txtStdLastName);
        btnSave = new JButton("Save");
        btnSaveAs = new JButton("Save As Object");
        btnReset = new JButton("Reset");
        
        btnSave.addActionListener(btnListener);
        btnSaveAs.addActionListener(btnListener);
        btnReset.addActionListener(btnListener);
        
        jpnButton.add(btnSave);
        jpnButton.add(btnSaveAs);
        jpnButton.add(btnReset);
        
        jpnStudentLeft = new JPanel(new BorderLayout());
        jpnStudentLeft.add(jpnStudentRecord, BorderLayout.NORTH);
        jpnStudentLeft.add(jpnButton, BorderLayout.CENTER);

        loadStudentDataToJTable();
        
        frameStudent.add(jpnStudentLeft, BorderLayout.WEST);
        frameStudent.add(scrlStudent, BorderLayout.CENTER);
        frameStudent.setSize(700, 400);
        frameStudent.setVisible(true);
        frameStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    public  void loadStudentDataToJTable() throws ClassNotFoundException, SQLException, IOException{
        String[] columnHeader={"StudentId","First Name","Last name"};
        StudentController stdCtrl = new StudentController("sit","sit");
        ArrayList<Student> list=stdCtrl.selectStudent();
        //convert ArrayList to two-dimention
        String[][] stdList=new String[list.size()][columnHeader.length];
        for (int i = 0; i < stdList.length; i++) {
            stdList[i][0]=(list.get(i)).getStdId()+"";
            stdList[i][1]=(list.get(i)).getFirstname();
            stdList[i][2]=(list.get(i)).getLastname();
            
        }
        
        tblStudent = new JTable(stdList,columnHeader);
        tblStudent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   
        StudentSelectionListener ssl=new StudentSelectionListener(tblStudent,txtStdId,txtStdFirstName,txtStdLastName);
        (tblStudent.getSelectionModel()).addListSelectionListener(ssl);
        scrlStudent = new JScrollPane(tblStudent);
        
        
    }
}



////        scrlStudent = new JScrollPane();
//        scrlStudent.add(tblStudent);
//        jpnStudentTable.add(scrlStudent);