/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GridLayout;
import javax.swing.*;
import model.StudentGrade;

/**
 *
 * @author INT105
 */
public class StudentGradeView {
    private JFrame frameGrade;
    private JLabel lblSubject[];
    private JTextField txtGrade[];
    private JTextField txtCredit[];
    private JButton btnCalculate;
    private StudentGrade[] stdGrade;
    
    public StudentGradeView(int numOfSubjects,StudentGrade[] myGrade){
        lblSubject =new JLabel[numOfSubjects];
        txtGrade =new JTextField[numOfSubjects];
        txtCredit =new JTextField[numOfSubjects];
        stdGrade=myGrade;
                initGui();
    }
    
    public void initGui(){
        frameGrade=new JFrame("GPA Calculator");
        frameGrade.setSize(400, 300);
        GridLayout grid=new GridLayout(7,3);
        frameGrade.setLayout(grid);
        addSubjectToFrame();
        
        btnCalculate=new JButton("Calculate");
        frameGrade.add(btnCalculate);
          
        
        
        frameGrade.setLocationRelativeTo(null);
        frameGrade.setVisible(true);
        frameGrade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addSubjectToFrame(){
          //add header label
        frameGrade.add(new JLabel("Subject"));
        frameGrade.add(new JLabel("Grade"));
        frameGrade.add(new JLabel("Credit"));
        
        //add subject, grade, credit
        for (int i = 0; i < stdGrade.length; i++) {
            lblSubject[i]=new JLabel(stdGrade[i].getCourse());
            txtGrade[i]=new JTextField(stdGrade[i].getGrade());
            Float credit=stdGrade[i].getCredit();
            //convert
            txtCredit[i]=new JTextField(credit+"");
            frameGrade.add(lblSubject[i]);
            frameGrade.add(txtGrade[i]);
            frameGrade.add(txtCredit[i]);
            
        }

    }
}
