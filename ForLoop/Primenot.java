// Write a Java program to check whether a number is prime or not.
import java.util.Scanner;
class Primenot{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valuse ");
		int number=sc.nextInt();
		int count;
		for(int i=1;i<=number;i++){
			if(number%i==0 && number%i=1){
				System.out.println(i+"number is prime");
				
			}
			else {
				System.out.println("number is not prime");

			}
		}
		
	}
}