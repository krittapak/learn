/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.view;

/**
 *
 * @author INT105
 */
public class Student {
    //visibility modifier (public/private)
    private long studentId;
    private String studentID;
    private static int autoID=0;
    
    public Student(){
        studentId=studentId/1000000000L;
    }

    public Student(long studentId, String studentID) {
        
        this.studentId=studentId/1000000000L;
        
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentID=" + studentID + '}'+" ,ID of student is "+autoID;
    }

    public static int getAutoId(){
        // static method ห้ามอ้าง Attribute that note static
        // static method อ้าง Attribute
        return autoID;
    }
    
}
