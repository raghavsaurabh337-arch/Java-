//Write a Java program to print all even numbers from 1 to 100.
import java.util.Scanner;
class AllEven{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		
	}
}