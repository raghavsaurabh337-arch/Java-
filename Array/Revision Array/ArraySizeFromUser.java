/* Take array size and elements from the user.*/
import java.util.*;
class ArraySizeFromUser{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values  of Array Size:");
		int size=sc.nextInt();
		int number[]=new int[size];
		System.out.println("Enter the values  of Array Values:");
		for(int i=0;i<number.length;i++){
			number[i]=sc.nextInt();
		}
		for(int j=0;j<number.length;j++){
			System.out.println(number[j]);
		}
	
	}
}