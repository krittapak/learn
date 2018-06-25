/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import javaapplication1.view.TestArray;

/**
 *
 * @author INT105
 */
public class addArrayTest {
    private int[] num1;
    private int[] num2;
    
    public addArrayTest() {
       
    }
    @Test
    public void addNumberOnTwoArraysSameLength(){
        num1=new int[]{1,2,3,4,5};
        num2=new int[]{5,2,1,7,9};    
        int[] expected={6,4,4,11,14};
        int[] actual=TestArray.addArray(num1,num2);
        assertArrayEquals(expected, actual);                
    }    
   @Test
    public void addNegativeArraytoNumberArraySameLength(){
        num1=new int[]{-5,-2,-3,-1,-10};
        num2=new int[]{5,2,1,7,9};    
        int[] expected={0,0,-2,6,-1};
        int[] actual=TestArray.addArray(num1,num2);
        assertArrayEquals(expected, actual);               
    }
     
    @Test
    public void addZeroArraytoNumberArraySameLength(){
        num1=new int[]{0,0,0,0,0};
        num2=new int[]{5,2,1,7,9};    
        int[] expected={5,2,1,7,9};
        int[] actual=TestArray.addArray(num1,num2);
        assertArrayEquals(expected, actual);               
    }   
    
    @Test
    public void addNumberOnTwoArraysNottheSameLength(){
        num1=new int[]{1,2,3};
        num2=new int[]{5,2,1,7,9};    
        int[] expected={6,4,4,7,9};
        int[] actual=TestArray.addArray(num1,num2);
        assertArrayEquals(expected,actual);        
    }
    
    @Test
    public void addNullArraytoNumberArray(){
        num1=null;
        num2=new int[]{5,2,1,7,9};    
        int[] actual=TestArray.addArray(num1,num2);
        assertNull(actual);        
    }
    
    
}
