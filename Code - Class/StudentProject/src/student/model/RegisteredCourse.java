
package student.model;

public class RegisteredCourse {
    private String courseId;
    private double courseCredit;
    private double grade;

    public RegisteredCourse() {
    }

    public RegisteredCourse(String courseId, double courseCredit, double grade) {
        this.courseId = courseId;
        this.courseCredit = courseCredit;
        this.grade = grade;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public double getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(double courseCredit) {
        this.courseCredit = courseCredit;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "RegisteredCourse{" + "courseId=" + courseId + ", courseCredit=" + courseCredit + ", grade=" + grade + '}';
    }
    
    
    
}
