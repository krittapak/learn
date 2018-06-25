package sit.model;

public class Course  {

    private String courseName;
   
    private int numberOfStudents;

    public Course(String courseName, int numOfStudentCanRegis) {
     
    }

   

    public int addStudent(RegisStudent student) {
        
    }
    
    public boolean dropStudent(RegisStudent student) {
        
    }   
    
    public RegisStudent[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public String toString() {
        String course = "----" + courseName + "----\n";
        for (RegisStudent rs : students) {
            course += rs + "\n";
        }
        return course;

    }
}
