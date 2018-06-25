/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JTextField;

/**
 *
 * @author INT105
 */
public class CalculateListener implements ActionListener{
    
    private JTextField txtGrade[];
    private JTextField txtCredit[];
    private JTextField txtGPA;

    public CalculateListener(JTextField[] txtGrade, JTextField[] txtCredit, JTextField txtGPA) {
        this.txtGrade = txtGrade;
        this.txtCredit = txtCredit;
        this.txtGPA = txtGPA;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Running");
        float gpa=0;
        float totalCredit=0;
        float totalGrade=0;
        for (int i = 0; i < txtGrade.length; i++) {
            float grade=convertLetterGradeToNumber(txtGrade[i].getText());
            float credit=Float.parseFloat(txtCredit[i].getText());
            totalGrade+=grade*credit;
            totalCredit+=credit;
        }
        gpa=totalGrade/totalCredit;
        DecimalFormat df= new DecimalFormat("0.00");
        
        txtGPA.setText(df.format(gpa));

    }
        public float convertLetterGradeToNumber(String grade){
        float value=-1;
        switch(grade){
            case "A": value=4;break;
            case "B+": value=3.5f;break;
            case "B": value=3;break;
            case "C+": value=2.5f;break;
            case "C": value=2;break;
            case "D+": value=1.5f; break;
            case "D": value=1;break;
            case "F": value=0;break;
        }
        return value;
    }

}
