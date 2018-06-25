class A{
	int x;
	A(int a){
		x=a;
	}
}
class B extends A{
	int y;
	B(int a, int b){
		super(a);
		y=b;
	}
}
class C extends B{
    int z;
	C(int a, int b, int c){
	    super(a, b);  
		z=c;
	}
	void print(){
		System.out.println("x = "+x+", y = "+y+",z = "+z);
	}
	public static void main(String[] args){ 
		C c=new C(7, 8, 9);
		c.print();
	}
}