// 5. Count even and odd numbers in an array.
import java.util.*;
class CountEvenOddNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size:");
		int size=sc.nextInt();
		System.out.println("Ennter the Array valuse :");
		int number[]=new int[size];
		for(int i=0;i<number.length;i++){
			number[i]=sc.nextInt();
		}
		int countOdd=0;
		int countEven=0;
		System.out.println("Result:");
		for(int i=0;i<number.length;i++){
			if(number[i]%2==0){
				
				countEven++;
							System.out.println("Even:"+countEven);

			}
			else{
				
				countOdd++;
				
			}

		}
		System.out.println("Odd:"+countOdd);
		
	}
}