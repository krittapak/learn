
package InheritanceProject;

public class Student {
    private long stdId;
    private String stdName;

    public Student() {
        System.out.println("Student Constructor Working");
    }

    public Student(long stdId, String stdName) {
        this.stdId = stdId;
        this.stdName = stdName;
    }

    public long getStdId() {
        return stdId;
    }

    public void setStdId(long stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    @Override
    public String toString() {
        return "GraduatedStudent{" + "stdId=" + stdId + ", stdName=" + stdName + '}';
    }
    
    public String showPortfolio(){
        return toString();
    }
}
