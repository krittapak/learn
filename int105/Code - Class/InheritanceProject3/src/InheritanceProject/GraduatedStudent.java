
package InheritanceProject;

public class GraduatedStudent {
    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "GraduatedStudent{" + "project=" + project + '}';
    }
}
