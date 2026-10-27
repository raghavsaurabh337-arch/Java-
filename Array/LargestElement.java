// 3. Find the largest element in an array.
class LargestElement{
	public static void main(String[] args){
		//Scanner sc =new Scanner(System.in);
		int number[]= {12,405,76,89,65};
		int largest=number[0];
		for(int i=0;i<number.length;i++){
			if(number[i]>largest){
				largest=number[i];
			}
		}
			System.out.println(largest);

	}
}