/* 6. Create a BankAccount class with a private variable balance. Access it using a public getter method.
*/

class BankAccountGetterMethod{
	private double balance=128;
	public double getname(){
		//System.out.println(balance);
		return balance;	
	}
	public static void main(String [] arsg){
		BankAccountGetterMethod obj=new  BankAccountGetterMethod();
		System.out.println(obj.getname());
	}
}