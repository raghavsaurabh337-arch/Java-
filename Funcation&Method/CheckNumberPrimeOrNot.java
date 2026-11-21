/*Create a function that checks whether a number is prime or not.*/
import java.util.*;
class Whether{
	void check(int number){
		if(number<=1){
			System.out.println("number is not prime");
			return;
		}
		 boolean isPrime = true;
		for(int i=2;i<=number;i++){
			if(number%i==0){
				isPrime=false;
				break;
				
			}
		}
		
		
		
		
		if(isPrime){
			System.out.println("Number is prime");
		}
		else{
		System.out.println("Number is Not");
	
		}
		
	}
}
class CheckNumberPrimeOrNot{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Whether obj=new Whether();
	obj.check(1);
	
}
}