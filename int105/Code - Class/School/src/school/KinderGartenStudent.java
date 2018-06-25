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
public class KinderGartenStudent extends Student{
    private double schoolBusFee;
    private double annualFee;
    private String parentName;

    public KinderGartenStudent(double schoolBusFee, double annualFee, String parentName, long studentId, String studentName, double tuition) {
        super(studentId, studentName, tuition);
        this.schoolBusFee = schoolBusFee;
        this.annualFee = annualFee;
        this.parentName = parentName;
    }

    @Override
    public double expensePerSemester(){
        return this.annualFee+this.schoolBusFee+this.tuition;
    }

    @Override
    public String toString() {
        return "KinderGartenStudent{" + "studentId=" + studentId + ", studentName=" + studentName + ", tuition=" + tuition + ", schoolBusFee=" + schoolBusFee + ", annualFee=" + annualFee + ", parentName=" + parentName + '}';
    }
    
}
