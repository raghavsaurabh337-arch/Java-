// Write a Java program to find the sum of numbers from 1 to N.
import java.util.Scanner;
class SumNumber{
	public static void main(String[] ars){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++){
			sum=sum+i;
			
			
		}
		System.out.println(sum);
	}
	
}