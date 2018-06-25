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
public class UniversityStudent extends Student {
    private double educationSupportFee;
    private boolean scholarship;
    private boolean alumni;
    
    public UniversityStudent(double educationSupportFee, boolean scholarship, boolean alumni, long studentId, String studentName, double tuition) {
        super(studentId, studentName, tuition);
        this.educationSupportFee = educationSupportFee;
        this.scholarship = scholarship;
        this.alumni = alumni;
    }
    
    public double expensePerSemester(){
        
        if (scholarship) {
            this.tuition=tuition-(tuition*10)/100;
            if (alumni) {
                tuition=tuition-(tuition*5)/100;
            }
        }
        return tuition;
    }
    
    @Override
    public String toString() {
        return "UniversityStudent" + "studentId=" + studentId + ", studentName=" + studentName + ", tuition=" + tuition + "educationSupportFee=" + educationSupportFee + ", scholarship=" + scholarship + ", alumni=" + alumni + '}';
    }
    
}
