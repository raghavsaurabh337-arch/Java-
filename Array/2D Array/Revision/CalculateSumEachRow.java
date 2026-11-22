/*
Write a Java program to calculate the sum of each row in a 2D array.


*/
import java.util.*;
class CalculateSumEachRow{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		int row=2;
		int coloum=2;
		
		int[][] arr=new int[row][coloum];
		System.out.println("Enter tha Array of values");
		
		
		for(int i=0;i<row;i++){
			int sum=0;
			
			for(int j=0;j<coloum;j++){
				arr[i][j]=sc.nextInt();
				sum=sum+arr[i][j];
				
			}
			System.out.println("sum "+(i+1)+"= "+sum);
		}
		
		
	}
}