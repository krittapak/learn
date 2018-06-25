/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import sit.model.Employee;
import sit.model.Manager;

/**
 *
 * @author SIT-USER
 */
public class TestEmployee {
    public static void main(String[] args) {
        //Employee emp1=new Employee(1, "Cherpang", 50000);
       // System.out.println("Cherpang Salary: "+emp1.pay());
        
        Manager mng1=new Manager(15000, 2, "Pun Pun", 100000);
        System.out.println(mng1);
        
      //  mng1.setManagerEmpId("MNG-001");
      //  System.out.println(mng1.getManagerEmpId());
        //System.out.println("Pun Salary: "+mng1.pay());
        
        
        Manager mng2=new Manager(15000, 2, "Pun Pun", 100000);
        System.out.println(mng1);
        
        System.out.println(mng1.equals(mng2));
        
        
        
    }
}
