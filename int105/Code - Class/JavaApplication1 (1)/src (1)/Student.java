public class Student {
    private long stdId;
    private String studentname;
    private double score;

    public Student() {
    }

    public Student(long stdId, String studentname, double score) {
        this.stdId = stdId;
        this.studentname = studentname;
        this.score = score;
    }

    public long getStdId() {
        return stdId;
    }

    public void setStdId(long stdId) {
        this.stdId = stdId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + ", studentname=" + studentname + ", score=" + score + '}';
    }
    
    
}