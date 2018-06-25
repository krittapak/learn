
package packageprivillege;


public class Sliver extends Privillege{
    protected double movieDiscount = 0.1;
    protected double movie;

    public Sliver() {
    }

    public Sliver(double movie, String name, long idCard, long number, String type, int point) {
        super(name, idCard, number, type, point);
        this.movie=movie;
        
    }

    public Sliver(String boss, long l, long l0, String sliver, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String promotion(){
       /*boolean g1 =movieDiscount;
       if (g1 == true){
           System.out.println("Movie Discount");
       }*/
        
        return type+movieDiscount;
    }
    
    

    public double isMovieDiscount() {
        return movieDiscount;
    }
    public void setMovieDiscount(double movieDiscount) {
      
     
        this.movieDiscount = movieDiscount;
        
    }
    public double computeMovieDiscount() {
      
     double discount = movie*movieDiscount;
     double netPrice = movie-discount;
     return netPrice;
        
    }

    @Override
    public String toString() {
        return "Sliver{" +super.toString()+ "movie= "+movie+", "+"movieDiscount=" + movieDiscount + '}';
    }
    
    
    
    
    
}
