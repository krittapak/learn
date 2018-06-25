/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

/**
 *
 * @author INT105
 */
public class Rectangle implements ShapeInterface, Comparable<Rectangle> {
    private  double width;
    private  double length;
    
    public int compareTo(Rectangle o){
        return (int)(findArea()-o.findArea());
    }
    
    public double findArea(){
        return width*length;
    }
    
    public double findCircumference(){
        return 2*(width+length);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double computeArea(){
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    
    
}


