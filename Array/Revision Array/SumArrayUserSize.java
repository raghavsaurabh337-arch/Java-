/*Find the array size user and sum of input  array elements.*/
import java.util.*;
class SumArrayUserSize{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter tha valuse of Array size:");
		int size=sc.nextInt();
		int number[]={34,23,45,67,98,34,56,12,45,76,89,45};
		if(number.length>=size){
			for(int i=0;i<size;i++){
				System.out.println(number[i]);
			}
		}
		else
		{
			System.out.println("Your enter the array size is not :");
		}
	}
}