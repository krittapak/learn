/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package warmup;
import warmup.Shape;
/**
 *
 * @author INT105
 */
public class TestShape {
    public static void main(String[] args) {
        Shape s1;
        Circle c1;
        Circle2 cc1=new Circle2(5.30);
        System.out.println(cc1);
        
        double area =cc1.findArea();
        double circum = cc1.findCircumference();
        System.out.println("Area="+area);
        System.out.println("Circum="+circum);
        
        Square2 s2=new Square2(5);
        System.out.println("Square2="+s2.findArea());
        System.out.println("Square2="+s2.findCircumference());
        
        Rectangle t1=new Rectangle(5,10);
        Rectangle t2=new Rectangle(2,4);
        System.out.println(t1.computeArea());
        System.out.println(t1.findArea());
        System.out.println(t1.findCircumference());
        int result=t1.compareTo(t2);
        System.out.println(result);
        if (result>0) {
            System.out.println("2 b 1");
            
        }else if (result<0) {
            System.out.println("1 b 2");
            
        }else {
            System.out.println("2 = 1");
            
        }
        
        
    }
}
