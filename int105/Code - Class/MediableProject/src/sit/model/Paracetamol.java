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
public class Paracetamol extends Medicine {
    
    public Paracetamol() {
    }

    public Paracetamol(int medicineId, String name, String[] ingredients, String properties, String warning) {
        super(medicineId, name, ingredients, properties, warning);
    }
    
    

    @Override
    public String toString() {
        return "Paracetamol{" + super.toString() +'}';
    }
    
    
    
    
}
