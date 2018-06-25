
package sit.view;
import java.sql.SQLException;
import sit.controller.StudentController;

public class TestStudent {
    public static void main(String[] args) {
        StudentController stdCtrl=new StudentController();
        try{
        stdCtrl.connectStudentDB("org.apache.derby.jdbc.EmbeddedDriver", "jdbc:derby://localhost:1527/student", "sit", "sit");   
        stdCtrl.selectAllStudent("select * from student");
        }
        catch(ClassNotFoundException cf){
            System.out.println(cf);
        }
        catch(SQLException sql){
            System.out.println(sql);
        }
    }
}
