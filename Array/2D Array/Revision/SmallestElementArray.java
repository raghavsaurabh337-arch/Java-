/*
Write a Java program to find the smallest element in a 2D array.


*/
class SmallestElementArray{
	public static void main(String[] args){
		int[][] arr={
			{2,3,4},
				{6,7,7}
		};
		int smallest=arr[0][0];
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				if(smallest>arr[i][j]){
					smallest=arr[i][j];
				}
			}
		}
		System.out.println("SmallestElement of Array "+smallest);
	}
}