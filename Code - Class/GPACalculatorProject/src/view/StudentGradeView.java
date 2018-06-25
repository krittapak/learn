/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.CalculateListener;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
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
    private JTextField txtGPA;
    private JButton btnCalculate;
    private StudentGrade[] stdGrade;
  
    
    public StudentGradeView(int numOfSubjects, StudentGrade[] myGrade){
        //create array of Labels and TextFields
       
        lblSubject =new JLabel[numOfSubjects];
        txtGrade =new JTextField[numOfSubjects];
        txtCredit=new JTextField[numOfSubjects];
        stdGrade=myGrade;
        initGui();
    }
   
    private void initGui(){
        //create JFrame
        frameGrade=new JFrame("GPA Calculator");
        frameGrade.setSize(400, 400);        
        //set layout manager to JFrame, 
        //replace default BorderLayout with GridLayout
        GridLayout grid=new GridLayout(8, 3);
        frameGrade.setLayout(grid);
        addSubjectsToFrame();

        frameGrade.add(new JLabel("GPA"));
        
        txtGPA=new JTextField("0.00");
        frameGrade.add(txtGPA);
        
        btnCalculate=new JButton("Calculate");
        CalculateListener cl=new CalculateListener(txtGrade,txtCredit,txtGPA);
        btnCalculate.addActionListener(cl);
        frameGrade.add(btnCalculate);
        
        frameGrade.pack();
        frameGrade.setLocationRelativeTo(null);
        frameGrade.setVisible(true);
        frameGrade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
    private void addSubjectsToFrame(){
         //add header label
        frameGrade.add(new JLabel("Subject"));
        frameGrade.add(new JLabel("Grade"));
        frameGrade.add(new JLabel("Credit"));
        
        //add subject, grade, credit
        for (int index = 0; index < stdGrade.length; index++) {
            //create JLabel and JTextField Objects to array
            lblSubject[index]=new JLabel(stdGrade[index].getSubject());
            txtGrade[index]=new JTextField(stdGrade[index].getGrade());  
            float credit=stdGrade[index].getCredit();
            //convert float to String
            txtCredit[index]=new JTextField(credit+"");
            
            //add each course to frame
            frameGrade.add(lblSubject[index]);
            frameGrade.add(txtGrade[index]);
            frameGrade.add(txtCredit[index]);
        }
        
       
        
    }
}
