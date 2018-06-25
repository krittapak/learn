
package InheritanceProject;

public class UnderGraduatedStudent extends Student{
    private String project;

    public UnderGraduatedStudent(String project) {
        this.project = project;
    }

    public UnderGraduatedStudent(String project, long stdId, String stdName) {
        super(stdId, stdName);
        this.project = project;
    }

    public UnderGraduatedStudent() {
        System.out.println("UnderGraduated Constructor Working");
    }
    
    
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "UnderGraduatedStudent{" + "project=" + project + '}';
    }
    
}
