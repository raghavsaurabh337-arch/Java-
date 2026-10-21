import java.util.Scanner;
class OperatersJava{
	public static void Add(int number1,int number2){
		int sum=number1+number2;
		System.out.println(sum);
	}
	public static void Sub(int number1,int number2){
		int sum=number1-number2;
		System.out.println(sum);
	}
	public static void Multi(int number1,int number2){
		int sum=number1*number2;
		System.out.println(sum);
	}
	public static void division(int number1,int number2){
		int sum=number1/number2;
		System.out.println(sum);
	}
	
	public static void main(String[] aer){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter tha valuse:");
		int number1=sc.nextInt();
		System.out.print("Enter tha valuse:");

		int number2=sc.nextInt();
		Add(number1,number2);
		Sub(number1,number2);
		Multi(number1,number2);
		division(number1,number2);
		
		
	}
}
