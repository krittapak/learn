
package packageprivillege;


public class Privillege {
    protected String name;
    protected long idCard;
    protected long number;
    protected String type;
    protected int point;

    public Privillege() {
    }

    public Privillege(String name, long idCard, long number, String type, int point) {
        this.name = name;
        this.idCard = idCard;
        this.number = number;
        this.type = type;
        this.point = point;
    }
    
    
   public String promotion(){
       return type;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIdCard() {
        return idCard;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public boolean equals(Object obj){
        Privillege temp=null;
        if(obj!=null && obj instanceof Privillege){
            temp=(Privillege)obj;
            if(idCard==temp.idCard &&getName().equals(temp.getName()))
          return true;
        }
        return false;
        
    }
    
    @Override
    public String toString() {
        return "Privillege{" + "name=" + name + ", idCard=" + idCard + ", number=" + number + ", type=" + type + ", point=" + point + '}';
    }
    
    
    
}
