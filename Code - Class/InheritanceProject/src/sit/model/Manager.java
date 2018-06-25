/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.model;

/**
 *
 * @author SIT-USER
 */
public class Manager extends Employee {
    //showdow empId to String type
   // private String empId;
    protected double positionAllowance;

  /*  public String getManagerEmpId(){
        return "(Employee) Emp Id= "+super.empId+"\n"+
                "(Manager) Emp Id = "+empId;
    }
   
    public void setManagerEmpId(String id){
        empId=id;
    }*/
    
    public Manager() {
    }

   
    public Manager(double positionAllowance, long empId, String empName, double payRate) {
        super(empId, empName, payRate);
        this.positionAllowance = positionAllowance;
    }
   
   
    public double getPositionAllowance() {
        return positionAllowance;
    }

    public void setPositionAllowance(double positionAllowance) {
        this.positionAllowance = positionAllowance;
    }
    public double pay(){
        return payRate+positionAllowance;
    }
    
    public boolean equals(Object obj){
        Manager temp=null;
        if(obj !=null && obj  instanceof Manager){
            temp=(Manager)obj;
            if(empId==temp.empId && getEmpName().equals(temp.getEmpName()))
                return true;
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "Manager{ "+super.toString()+"positionAllowance=" + positionAllowance +"}";
        //"Manager { "+"Emp Id = "+getEmpId()+"payRate = "+payRate+ "positionAllowance=" + positionAllowance + '}';
        
    }

    
   

   
}
