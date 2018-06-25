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
public abstract class Medicine implements Mediable{
    private int medicineId;
    private String name;
    private String[] ingredients;
    private String properties;
    private String warning;
    
    public Medicine() {
    }

    public Medicine(int medicineId, String name, String[] ingredients, String properties, String warning) {
        this.medicineId = medicineId;
        this.name = name;
        this.ingredients = ingredients;
        this.properties = properties;
        this.warning = warning;
    }

   

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }
    

    @Override
    public String toString() {
        String medString="Medicine{" + "medicineId=" + medicineId + ", name=" + name +"\n";
        for(String ing: ingredients)
            medString+=ing+"\n";
        medString+="properties= "+ properties;
        medString+="warning= "+warning+ "}";
        return medString;
        
    }
    public String medicProperties(){
        return properties;
    }
    public String[] medicIngredients(){
        return ingredients;
    }
    public String medicWarning(){
        return warning;
    }
    
}
