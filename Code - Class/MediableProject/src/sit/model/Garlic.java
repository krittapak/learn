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
public class Garlic extends Herb {
    private String garlicSpecies;

    public Garlic(String garlicSpecies, int herbId, String herbName, String properties, String warning) {
        super(herbId, herbName, properties, warning);
        this.garlicSpecies = garlicSpecies;
    }

    public String getGarlicSpecies() {
        return garlicSpecies;
    }

    public void setGarlicSpecies(String garlicSpecies) {
        this.garlicSpecies = garlicSpecies;
    }

    @Override
    public String toString() {
        return "Garlic{" + "garlicSpecies=" + garlicSpecies + '}';
    }

   

   
    

   
    
}
