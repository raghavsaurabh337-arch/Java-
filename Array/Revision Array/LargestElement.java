/* Find the user input Array size and depenad on size after  largest element in an array. */
import java.util.*;
class LargestElement{
public static void main(String[] aes){
	Scanner sc =new Scanner(System.in);
		System.out.println("Enter tha valuse of Array size:");
		int size=sc.nextInt();
		
		int number[]={34,23,45,7,98,34,56,12,45,76,89,45};
		int largest=number[0];
		if(number.length>=size){
				for(int i=0;i<size;i++){
					if(number[i]>largest){
						largest=number[i];
					}
					
				}
				System.out.println(largest);
		}
		
		else
		{
			System.out.println("Your enter the array size is not :");
		}
		
}
}
