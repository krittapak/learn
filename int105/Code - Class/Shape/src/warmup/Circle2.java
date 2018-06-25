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
public class Circle2 extends Circle {
    
    public Circle2() {
    }

    public Circle2(double radius) {
        super(radius);
    }
    

    public String toString(){
        return super.toString();
    }
    
    public double findCircumference(){
        return 2*Math.PI*getRadius();
    }
}
