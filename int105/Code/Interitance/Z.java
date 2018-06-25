class A{
	int x=1;
	void print(){
		System.out.println(x);
	}
}
class B extends A{
	int x=2;
	void print(){
		System.out.println(x);
	}
}
class Z{
	public static void main(String[] args){
		A a=new A();
		a=new B();
		a.print();
		System.out.println("a.x = "+a.x);
	}
}