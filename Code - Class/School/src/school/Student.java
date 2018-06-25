/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author INT105
 */
public abstract class Student {
    protected long studentId;
    protected String studentName;
    protected double tuition;

    public Student(long studentId, String studentName, double tuition) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.tuition = tuition;
    }
    
    public abstract double expensePerSemester();

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", tuition=" + tuition + '}';
    }

}
