/* Find Largest Element (Medium)
Ek 2D array mein sabse bada number find karo.*/
import java.util.*;
class TwoDMatrixLargestElement{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the matrix of RoW:");
		int row=sc.nextInt();
		System.out.println("Enter the matrix of coloums:");
		int coloums=sc.nextInt();	
		System.out.println("Enter the matrix of values but row*coloums :");
		
		
		int [][] number=new int[row][coloums];
			for(int i=0;i<row;i++){
				for(int j=0;j<coloums;j++){
					number[i][j]=sc.nextInt();
				}
			}
			int largest=number[0][0];
			for(int i=0;i<row;i++){
				for(int j=0;j<coloums;j++){
					if(number[i][j]>largest){
					int temp=number[i][j];
					largest=temp;
					}
					System.out.print(number[i][j]+" ");
				}
				System.out.println(" ");
			}
			System.out.println(largest);

	}
	
}