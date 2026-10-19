// Even and Odd
import java.util.Scanner;
class SwtichEvenOdd{
	public static void main(String[] ags){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
	int number =sc.nextInt();
	switch(number%2){
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
			
		  
	}
		
	}
}