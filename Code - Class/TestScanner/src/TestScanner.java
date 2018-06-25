


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class TestScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String myMessage="Apple Mango   Apple";
//        int count=0;
//        Scanner sc=new Scanner(myMessage);
//                while(sc.hasNext()){
//                    count+=1;
//                
//                }
//        System.out.println(count);
        ArrayList<Student> stdList=new ArrayList<Student>();
        int numOfWord=0;
        int numOfLine=0;
        int numOfLength=0;
        try{
        
        Scanner sc=new Scanner(new File("StudentList.txt"));
        while(sc.hasNext()){
            numOfLine+=1;
            String line=sc.nextLine();
            //System.out.println(line);
            //System.out.println("----");
            
            Scanner scStr=new Scanner(line);
            while(scStr.hasNextLine()){
                int id=scStr.nextInt();
                String firstname=scStr.next();
                String lastname=scStr.next();
                Student std=new Student(id,firstname,lastname);
                stdList.add(std);
                numOfWord+=1;
//                System.out.println(scStr.next());
            }
            //System.out.println("---");
            for (int i = 0; i < line.length(); i++) {
                numOfLength++;
            }
        }
            
            
            
        }
        catch(FileNotFoundException ff){
            System.out.println(ff);
        }
        System.out.println("The number of words is "+numOfWord);
        System.out.println("The number of lines is "+numOfLine);
        for (Student student:stdList) {
            System.out.println(student);
        }
}
}
