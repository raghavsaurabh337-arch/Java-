/* 19. Create a Bank class with a constructor to initialize balance and methods to deposit and withdraw money.*/
import java.util.*;
class Bank{
	int balance;
		Bank(){
				balance=100;
		}
		void balancecheck(){
						System.out.println("You are Account balance: "+balance);

		}
		void  deposit(int deposit){
			balance=balance+deposit;
			 System.out.println("you Account balance:"+balance);
			
			
		}
		void  withdraw(int withdraw){
			if(balance>=withdraw){
			balance=balance-withdraw;
			System.out.println("your tha balance Now:"+balance);	
			}
			else{
				System.out.println("this is not Account balance "+balance);
			}
			
			
			
		}
		}
		
class BnakSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("1. deposit");
		System.out.println("2. withdraw");
		System.out.println("3. balance check");		
		System.out.println("4. exti");
		System.out.println("Enter the number and choice:");
		int number=sc.nextInt();
		Bank obj=new Bank();
		switch(number){
			
			case 1:
				System.out.println("Enter the deposit Amount:");
				int amount=sc.nextInt();
				obj.deposit(amount);
				break;
			case 2:
			System.out.println("Enter the withdraw Amount:");
				amount=sc.nextInt();
				obj.withdraw(amount);
				break;
			case 3:
				obj.balancecheck();
				break;
			default:
				System.out.println("exit");
			
				
			
		}
	}
}		 