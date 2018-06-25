/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author INT105
 */
public class StudentGrade {
    private String subject;
    private float credit;
    private String grade;

    public StudentGrade(String subject, float credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

   
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentGrade{" + "subject=" + subject + ", credit=" + credit + ", grade=" + grade + '}';
    }

    
    
}
