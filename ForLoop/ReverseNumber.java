// Write a Java program to reverse a number using a for loop.
import java.util.Scanner;// user 1234, 4321
class ReverseNumber{
	public static void main(String[] args){
		
		int number=1234;
		int reverse=0;
		while(number!=0){
			int mod=number%10;
			System.out.println("mod"+mod);
			reverse=reverse*10+mod;
			System.out.println("reverse"+reverse);
			number=number/10;
			System.out.println("number"+number);
		}
		number=reverse;
		System.out.println(number);
	}
		
		
}