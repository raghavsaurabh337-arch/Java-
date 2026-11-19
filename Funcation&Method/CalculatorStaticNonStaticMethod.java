/*1. Create a Calculator class with 2 static methods and 2 non-static methods for addition, subtraction, multiplication and division.*/
import java.util.*;
class calculator{
	static void addition(int firstnumber, int secondtnumber ){
		
		int total=firstnumber+secondtnumber;
		System.out.println("Number of addition: "+total);
	}
	static void subtraction(int firstnumber, int secondtnumber ){
		
		int total=firstnumber-secondtnumber;
		System.out.println("Number of subtraction "+total);
	}
	 void multiplication(int firstnumber, int secondtnumber ){
		
		int total=firstnumber*secondtnumber;
		System.out.println("Number of multiplication "+total);
	}
	 void division(int firstnumber, int secondtnumber ){
		
		int total=firstnumber/secondtnumber;
		System.out.println("Number of division "+total);
	}
	
}
class CalculatorStaticNonStaticMethod{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		calculator obj = new calculator();
		System.out.println("Enter the values of number firstnumber");
		int firstnumber=sc.nextInt();
		
		
		System.out.println("Enter the values of number secondtnumber");
		int secondtnumber=sc.nextInt();
		
		calculator.addition(firstnumber,secondtnumber);
		calculator.subtraction(firstnumber,secondtnumber);
		
		obj.multiplication(firstnumber,secondtnumber);
		obj.division(firstnumber,secondtnumber);
		
	}
}