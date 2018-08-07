/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.model;

/**
 *
 * @author Krittapak
 */
public class checkingModel {
    private int number;

    public checkingModel(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getResult(){
      int limit = (int) Math.sqrt(number); 
      for (int i = 2; i <= limit; i++) { 
         if (number % i == 0) { 
            return "not primenumber.";
         }   
      }
      return "primenumber.";
    }

    @Override
    public String toString() {
        return String.format("%d is %s", number, getResult());
    }
    
    
    
}
