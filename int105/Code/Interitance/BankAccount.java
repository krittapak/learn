public class BankAccount{
	private int accId;
	private double balance;
	
	BankAccount(int id, double ba){
		accId=id;
		balance=ba;
	}
	
	public void setAccId(int id){
		accId=id;
	}
	public void setBalance(double bal){
		balance=bal;
	}
	public int getAccId(){
		return accId;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit(double amount){
		balance=balance+amount;
	}
	public void withdraw(double amount){
		if(amount<=balance)
		   balance=balance-amount;
		else
		   System.out.println("cannot withdraw please check your balance");
	}
	
	public String toString(){
		return "Account Id = "+ accId +"\nBalance = " +balance;	
   }	
   
   	public boolean equals(Object o){
		if(o !=null && o instanceof BankAccount){
			BankAccount tmp=(BankAccount)o;
			if(accId==tmp.getAccId())
				return true;
		}
		return false;
	}
	public static void main(String[] args){
		BankAccount ba1=new BankAccount(123,500);
		BankAccount ba2=new BankAccount(121,1000);
		System.out.println(ba1.equals(ba2));
		
	}
}
