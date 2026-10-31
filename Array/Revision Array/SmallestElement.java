/* Find the smallest element in an array.*/

class SmallestElement{
	public static void main(String [] ara){
		int number[]={23,45,3,45,64,54,78,9,54,0};
		int smallest=number[0];
		for(int i=0;i<number.length;i++){
			if(number[i]<smallest){
				smallest=number[i];
				
			}
			
		}
		System.out.println(smallest);
	}
}