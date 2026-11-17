// 1. Write a Java program to declare and print a 2D array (3×3 matrix).

class DeclareAndPrint{
	public static void main(String [] args){
		int arr[][]={
			{3,4,5},
			{3,4,5},
			{3,4,5},
			};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}
}