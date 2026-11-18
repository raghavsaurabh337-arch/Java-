/*  Write a Java program to find the diagonal elements of a 3×3 matrix.*/
import java.util.*;
class FindDiagonalElements{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int row =3;
		int coloum=3;
		System.out.println("Enter tha values of matrix ");
		int[][] arr=new int[row][coloum];
		for(int i=0;i<row;i++){
			for(int j=0;j<coloum;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int diagonal=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<coloum;j++){
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		
		
		
		System.out.println("Main Diagonal Elements:");

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < coloum; j++) {

                if(i == j) {
                    System.out.println(arr[i][j]);
                }

            }
        }
		
	}
}