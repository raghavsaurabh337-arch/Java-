import java.util.Scanner;
class AtmMenu{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int balance=8997;
		System.out.println("your choice ATM Menu");
		System.out.println("1.Check Balnace");
		System.out.println("2.Deposit Money");
		System.out.println("3.Withdraw Money");	
		System.out.println("4.Exit");
		
		int choice=sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("your are balance  "+balance);
				break;
			case 2:

				System.out.println("Enter your Deposit balance:");
						int userInputBalance=sc.nextInt();
				balance += userInputBalance;
				System.out.println("your are balance  "+balance);
				break;
			case 3:
				System.out.println("Enter your Withdraw balance:");
				int userInput=sc.nextInt();
				if(balance>=userInput){
					balance-=userInput;
				System.out.println("Less balance "+balance);
				}
				else{
					System.out.println("Only you are balance "+balance);
				}
				break;
			case 4:
				System.out.println("you are exit this app");

				break;
			default:
				System.out.println("Invail");
		}
		
		
	}
}