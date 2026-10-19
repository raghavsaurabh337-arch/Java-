// Write a Java program to find the factorial of a number.
import java.util.Scanner;
class FactorialNumber{
	public static void main(String[] atgs){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valuse ;");
		int number= sc.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++){
			/*if(number==0 && number==1){
				System.out.println(number);				
			}
			else{
				fact=fact*i;				
			}*/
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
	

}