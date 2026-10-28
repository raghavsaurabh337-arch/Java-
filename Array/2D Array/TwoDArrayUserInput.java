import java.util.*;
class TwoDArrayUserInput{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the values of row:");
		int row=sc.nextInt();
		System.out.println("Enter the values of coloums:");
		int coloums=sc.nextInt();
		
		int [][] number=new int[row][coloums];
			System.out.println("Enter the vluse of matrix :");
			// user input
		for(int i=0;i<row;i++){  // input row
			for(int j=0;j<coloums;j++){ // coloums input
				number[i][j]=sc.nextInt();
			}		
		}
		
		
		// output
		System.out.println("Matrix print  output :");
		
		for(int i=0;i<row;i++){  //row
			for(int j=0;j<coloums;j++){ //coloums output
				System.out.print(" "+ number[i][j]);
				
			}
			System.out.println(" ");			
					
		}
		
		
	}
}