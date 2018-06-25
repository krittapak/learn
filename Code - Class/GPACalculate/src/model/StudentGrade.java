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
    private String course;
    private float credit;
    private String grade;

    public StudentGrade(String course, float credit, String grade) {
        this.course = course;
        this.credit = credit;
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
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
        return "StudentGrade{" + "course=" + course + ", credit=" + credit + ", grade=" + grade + '}';
    }
    
    
    
}
