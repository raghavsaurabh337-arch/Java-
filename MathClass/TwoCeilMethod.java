import java.util.Scanner;

class TwoCeilMethod{
	public static void main(String [] agrs){
		double number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values:");
		number =sc.nextDouble();
		double output=Math.ceil(number);
		System.out.println(output);
	}
}