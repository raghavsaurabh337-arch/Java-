// Write a Java program to find the sum of all elements in a 2D array.
import java.util.*;
class AllSumElementsArray{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of row:");
		int row=sc.nextInt();
		System.out.println("Enter the value of Coloum:");
		int coloum=sc.nextInt();
		int sum=0;
		int[][] arr =  new int[row][coloum];
		System.out.println("Enter the value of Array :");
		for(int i=0;i<row;i++){
			for(int j=0;j<coloum;j++){
				
				arr[i][j]=sc.nextInt();
				sum=sum+arr[i][j];
			}
		}
		
		
		for(int i=0;i<row;i++){
			for(int j=0;j<coloum;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println(" ");
		}
			System.out.println("sum of total array "+sum);	
	}
	

}