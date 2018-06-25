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
public abstract class Herb implements Mediable {
    private int herbId;
    private String herbName;
    private String properties;
    private String warning;
    
    
    public Herb() {
    }

    public Herb(int herbId, String herbName, String properties, String warning) {
        this.herbId = herbId;
        this.herbName = herbName;
        this.properties = properties;
        this.warning = warning;
    }

  
    public int getHerbId() {
        return herbId;
    }

    public void setHerbId(int herbId) {
        this.herbId = herbId;
    }

    public String getHerbName() {
        return herbName;
    }

    public void setHerbName(String herbName) {
        this.herbName = herbName;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }
    
    @Override
    public String toString() {
        String herbString= "Herb{" + "herbId=" + herbId + ", herbName=" + herbName;
        herbString+=", properties= "+properties+"\n";
        for(String g: medicIngredients())
                herbString+=g+"\n";
        herbString+=", warning="+medicWarning()+'}';
        return herbString;
    }
    
    public String medicProperties(){
        return properties;
    }
    public String[] medicIngredients(){
        String ing[]={herbName};
        return ing;
    }
    public String medicWarning(){
        return warning;
    }
    
}
