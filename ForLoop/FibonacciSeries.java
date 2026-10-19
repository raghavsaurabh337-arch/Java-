// Fibonacci series
import java.util.Scanner;
class FibonacciSeries{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Fibonacci Series number");
		int number=sc.nextInt();
		int first=0;
		int second=1;
		for(int i=0;i<=number;i++){
				System.out.println(first+" ");
			int sum=first+second;
			first=second;
			second=sum;
			
		}
	}
	
}