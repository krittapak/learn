public class Adder {
	public static void main(String[] args) {
		if (args.length == 2) {
			int x = Integer.parseInt(args[0]) ;
			int y = Integer.parseInt(args[1]) ;
			System.out.println("Result = "+ (x+y));
		}
		else
			System.out.println("Using: java Adder value1  value2");
		
	}
}
