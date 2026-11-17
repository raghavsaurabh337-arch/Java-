// Write a Java program to find the largest element in a 2D array.
/* 
		input user Array Size 
		input Array Values
*/
import java.util.*;

class LargestElementArray{
	public static void main(String[] arhs){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter tha values of Row;");
		int row = sc.nextInt();
		System.out.println("Enter tha values of Coloum");
		
		int coloum= sc.nextInt();
		int[][] arr= new int[row][coloum];
		System.out.println("Enter the vlause of array: ");
		int largest=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<coloum;j++){
				arr[i][j]=sc.nextInt();
				if(largest<arr[i][j]){
					largest=arr[i][j];
					
				}
				
			}
		}
		System.out.println("largest number : "+largest);
		
		
	}
	
}