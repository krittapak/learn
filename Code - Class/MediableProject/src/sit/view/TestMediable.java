/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import sit.model.Garlic;
import sit.model.Herb;
import sit.model.Mediable;
import sit.model.Medicine;
import sit.model.Paracetamol;

/**
 *
 * @author INT105
 */
public class TestMediable {
    public static void main(String[] args) {
        Mediable med1;
        Medicine mc1;
        Herb h1;
        
        med1=new Paracetamol(1, "Para", new String[]{"P1", "P2"}, "headache prevention", "do not take over 10 tabs");
        String[] paraIng=med1.medicIngredients();
        for(String ing: paraIng)
            System.out.println(ing);
        
        med1=new Garlic("A", 12, "GarlicA", "heart prevention", "do not talk after eating");
        
        String[] garlicIng=med1.medicIngredients();
        for(String ing: garlicIng)
            System.out.println(ing);
    }
}
