/*8. Create a BankAccount class and initialize account holder name and balance.
*/

class BankAccount{
	String holder_name;
	int balance;
	BankAccount(String holder_name, int balance){
		this.holder_name=holder_name;
		this.balance=balance;
		  System.out.println("Account Holder: " + this.holder_name);
        System.out.println("Balance: " + this.balance);
	}

}

class BankAccountCon{
	public static void main(String[] args){
		BankAccount myobj= new  BankAccount("saurabh",78879);
	}
}