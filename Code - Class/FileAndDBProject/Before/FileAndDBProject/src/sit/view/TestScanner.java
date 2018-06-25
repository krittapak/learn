package sit.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import sit.model.Student;

public class TestScanner {
    public static void main(String[] args) {
        int numOfLines=0;
        int numOfWords=0;
        int numOfChar=0;
        ArrayList<Student> stdList=new ArrayList<Student>();
        try{
            File myFile=new File("StudentList.txt");            
            Scanner sc=new Scanner(myFile);
           
            while(sc.hasNextLine()){   
                numOfLines+=1;
                String line=sc.nextLine();
                numOfChar+=line.length();
                //System.out.println(line);
                //System.out.println("---");
                
                Scanner scStr=new Scanner(line);                
                while(scStr.hasNext()){
                    int id=scStr.nextInt();
                    String firstname=scStr.next();
                    String lastname=scStr.next();
                    Student std=new Student(id, firstname, lastname);
                    stdList.add(std);
                    numOfWords+=1;
                  //  System.out.println(scStr.next());                 
                }
                //System.out.println("---");
            }
        }
        catch(FileNotFoundException ff){
            System.out.println(ff);
        }
        for (Student student : stdList) {
            System.out.println(student);
        }
        
        System.out.println("Number of Lines: "+numOfLines);
        System.out.println("Number of Words: "+numOfWords);
        System.out.println("Number of Chars: "+numOfChar);
       
        //Scanner sc=new Scanner(System.in);
        /*String myMessage="Mango 123   Grape     Apple Guava";
        int words=0;
        Scanner sc=new Scanner(myMessage);
        while(sc.hasNext()){
            System.out.println(sc.next());
            words+=1;
        }
        System.out.println("Number of words: "+words);*/
        
    }
}
