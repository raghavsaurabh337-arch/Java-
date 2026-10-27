	// 4. Find the smallest element in an array  user input.
import java.util.*;
class  SmallestElement{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Array size :");
		int size=sc.nextInt();
		
		
		System.out.print("Enter the valuse of user:");
		int number[] =new int[size];
		
		
		
		for(int i=0;i<number.length;i++){
			number[i]=sc.nextInt();
		}
		
		int smallest=number[0];
		for(int i=0;i<number.length;i++){
			if(number[i]<smallest){
				smallest=number[i];
			}
		}
		System.out.print("smallest valuse:"+smallest);
		
	}
}