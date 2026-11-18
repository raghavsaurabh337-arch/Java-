/* Write a Java program to count even and odd numbers in a 2D array. */
import java.util.*;
class CountEvenOddNumber{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		int row=2;
		int coloum=2;
		int odd=0;
		int even=0;
		int[][] arr=new int[row][coloum];
		System.out.println("Enter tha Array of values");
		for(int i=0;i<row;i++){
			for(int j=0;j<coloum;j++){
				arr[i][j]=sc.nextInt();
				if(arr[i][j]%2==0){
					odd++;
				}
				else{
					even++;
				}
				
			}
		}
		System.out.println("Even : "  +  even + "  Odd Number "+odd);
		
	}
}