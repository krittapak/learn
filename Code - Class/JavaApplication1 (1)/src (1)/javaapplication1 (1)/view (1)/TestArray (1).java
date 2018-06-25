package javaapplication1.view;
import JavaAplication1.Student;
public class TestArray {
    public static void printStudentArray(Student registeredStudent[]){
        for(Student s : registeredStudent){
            System.out.println(s);
        }
    }
    public static void printScore(Student stds[]){
        for(int index=0,){
            System.out.println(s);
        }
    }
    public static void main(){
        Student stds=new Student[3];
        stds[0]=new Student(1,"May",50);
        stds[1]=new Student(2,"June",30);
        stds[2]=new Student(3,"August",40);
        
        printStudentArray(stds);
        
        Student stds2[]={new Student(4,"Jan",70),new Student(5,"Feb",42)};
        
        
    }
    /*
    public static int[] addArray(int[] num1, int[] num2) {
        for (int value1:values1) {
            System.out.println(value1);
        }
        for (int value2:values2) {
            System.out.println(value2);
        }
        int sum = value1+value2;
        return sum;
         
        if(num1==null || num2==null){
            return null;
        }
        int dataSize=0;
        int[] sum;
        if (num1.length>num2.length) {
            sum = new int[num1.length] ;
            dataSize = num2.length;
            for (int index = dataSize; index < num1.length; index++) {
                sum[index]=num1[index];
            }                    
        }
        else{
            sum = new int[num2.length] ;
            dataSize = num1.length;
            sum=num2;
            for (int index = dataSize; index < num2.length; index++) {
                sum[index]=num2[index];
            }
        }

        for (int index = 0; index < dataSize; index++) {
            sum[index] = num1[index] + num2[index];
        }       
        return sum;
    }
    
    public static void main(String[] args){
        
        //array int
        int num;
        num=10;
        //array of int
        int[] nums; //array reference
        nums=new int[10];
        //OR int[] nums=new int[10];
        nums[0]=10;
        nums[nums.length-1]=5;
        for (int index = 0; index < nums.length; index++) {
            System.out.println(nums[index]);
        }
        //for each
        //for(datatype variable:array variable name)
        for(int n:nums){
            System.out.println(n);
        }
        
        
        //Syntax1
        double weights[]=new double[5];
            weights[0]=80.54;
            weights[1]=100.68;
            weights[2]=50.00;
            weights[3]=45.54;
            weights[4]=75.97;
        
        //Syntax2
        double scores[]={80.54,100.68,50.00,45.54,75.97};

        //Syntax3   
        double temps[]=new double[]{32.54,46.23,54.18};
        
        int scores1[]={5,10,2,7,8};
        int scores2[]={1,2,3,4,5};
        addArray(scores1,scores2);

     */

}
