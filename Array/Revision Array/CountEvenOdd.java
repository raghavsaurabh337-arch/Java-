/*  Count even and odd numbers in an array.*/
class CountEvenOdd{
	public static void main(String [] arags){
		int [] number ={2,3,4,5,6,7,5,4,34,5,34,3,2,8,5};
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<number.length;i++){
			if(number[i]%2==0){
				evenCount++;
				
			}
			
			else {
				oddCount++;
				
			}
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}
}