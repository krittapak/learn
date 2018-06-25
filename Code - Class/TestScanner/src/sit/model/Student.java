/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.model;

/**
 *
 * @author INT105
 */
public class Student {
    private int stdId;
    private String stdFirstName;
    private String StdLastName;

    public Student() {
    }

    public Student(int stdId, String stdFirstName, String StdLastName) {
        this.stdId = stdId;
        this.stdFirstName = stdFirstName;
        this.StdLastName = StdLastName;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdFirstName() {
        return stdFirstName;
    }

    public void setStdFirstName(String stdFirstName) {
        this.stdFirstName = stdFirstName;
    }

    public String getStdLastName() {
        return StdLastName;
    }

    public void setStdLastName(String StdLastName) {
        this.StdLastName = StdLastName;
    }

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + ", stdFirstName=" + stdFirstName + ", StdLastName=" + StdLastName + '}';
    }
    
    
}
