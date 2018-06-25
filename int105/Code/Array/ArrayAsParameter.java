public class ArrayAsParameter {
  public static void printArray(int a[]){
    a[a.length-1]=2;
	for(int i=0;i<a.length;i++)
		System.out.println("a["+i+"] = "+a[i]);
  }
  public static void main(String[] args) {
	//int num[]={5, 4, 3};
	//printArray(num);
	int num[]=new int[3];
	num[0]=5;
	num[1]=4;
	num[2]=3;
	printArray(num);
	System.out.println("after call printArray");
	for(int i=0;i<num.length;i++)
		System.out.println("num["+i+"] = "+num[i]);
	//printArray(new int[]{5, 4, 3});


	
  }
  
    
   
 
}
