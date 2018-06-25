


public class ExceptionHandler {
    public static double divideByZero(int dividend,int divider)
                throws ArithmeticException,NegativeDividerException{
        System.out.println("divideByZero begin");
        double result=0;
        if (divider<0) {
            throw new NegativeDividerException("Negative Divider");
        }
        result=dividend/divider;
//        try{
//        result=dividend/divider; //throw ArithmeticException();
//            System.out.println("Try block");
//        }
//        
//        catch (ArithmeticException ae){
//            ae.printStackTrace();
//        }
//        finally{
//            System.out.println("Finally #1");
//            System.out.println("Finally #2");
//        }
        System.out.println("divideByZero end");
        return result;
    }
    
    public static double doSomeThing() throws NegativeDividerException{
        System.out.println("doSomeThing begin");
        double anwser=0;
        anwser=divideByZero(5,-2);
//        try{
//        anwser=divideByZero(5,-2);
//        }
//        catch (ArithmeticException ae){
//            ae.printStackTrace();
//        }
//        catch (NegativeDividerException ae){
//            System.out.println("Negative Catch block: "+ae.getMessage());
//        }
//        finally{
//            System.out.println("Finally #1");
//            System.out.println("Finally #2");
//        }
        System.out.println("doSomeThing end");
        return anwser;
    }
    
    public static void main(String[] args) throws NegativeDividerException {
        System.out.println("main begin");
        double divideResult=doSomeThing();
        System.out.println("Result="+divideResult);
        System.out.println("main end");
    }
}
