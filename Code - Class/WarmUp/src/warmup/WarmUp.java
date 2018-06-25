package warmup;

public class WarmUp {

    public static void main(String[] args) {
        double []num={1,2,3,4,5};
        System.out.println("Sum = "+sum(num));
    }
    public static double sum(double number[]){
        double sum=0;
        for (int i = 0; i < number.length; i++) {
            sum=sum+number[i];
        }
        return sum;
     }
}
