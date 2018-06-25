/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.StudentGrade;

/**
 *
 * @author INT105
 */
public class TestStudentGradeGui {
    public static void main(String[] args) {
        StudentGrade myGrade[]=new StudentGrade[6];
        myGrade[0]=new StudentGrade("int105",3,"A");
        myGrade[1]=new StudentGrade("int106",3,"A");
        myGrade[2]=new StudentGrade("int107",3,"B");
        myGrade[3]=new StudentGrade("MTH105",3,"A");
        myGrade[4]=new StudentGrade("GEN105",3,"C");
        myGrade[5]=new StudentGrade("LNG105",3,"A");
        
        
        StudentGradeView sgv=new StudentGradeView(6,myGrade);
    }
}
