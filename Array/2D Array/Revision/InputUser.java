// Write a Java program to take input from the user and print a 2D array.
 import java.util.*;
 
 class InputUser{
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Martix number: ");
		 int[][] arr=new int[2][2];
		 for(int i=0;i<2;i++){
			 for(int j=0;j<2;j++){
				 arr[i][j]=sc.nextInt();
			 }
		 }
		 
		 
		 
		 
		 for(int i=0;i<2;i++){
			 for(int j=0;j<2;j++){
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println(" ");
		 }
		
		 
	 }
 }