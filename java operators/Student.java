import java.util.Scanner;
class Student{
	public static void main(String []args){
		int Account_number=138123;
		int Account_number_user;
		int Account_balance;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Acount number:");
		Account_number_user =sc.nextInt();
		if(Account_number==Account_number_user){
			System.out.println("Your enter Account number match");
			System.out.println("Enter the Acount balance:");
			Account_balance =sc.nextInt();
			if(Account_balance==0){
				Account_balance -= 100;
				System.out.println(Account_balance);
			}
			else if(Account_balance>=100 && Account_balance<=500){
				Account_balance +=10;
				System.out.println(Account_balance);
				
			}
			else if(Account_balance>=500 && Account_balance<1000){
				Account_balance+=34;
				System.out.println(Account_balance);
				
			}
			else {
				System.out.println(Account_number+" plz maintance balance 1000");
			}
			
		}
		else{
			System.out.println("Try angin Account holder enter you number: ");

		}
	}
}