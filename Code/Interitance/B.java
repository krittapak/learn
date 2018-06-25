class A{
	int x=1;
	
	void print(){
		System.out.println("A"+x);
	}
}
class B extends A{
	int x=2;
	void print(){
		System.out.println("x : "+x+", parent's x : "+super.x);
		super.print();
	}
	public static void main(String[] args){
	    B b=new B();
		System.out.println(b.x);
	    b.print();
	}
}
