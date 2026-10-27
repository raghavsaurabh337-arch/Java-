// 6. Reverse an array.
class ReverseArray{
	public static void main(String[] arsgs){
		int number[]={34,56,43,76,89,35};
		int first=0;
		int last=number.length-1;
		while(first<last){
			int temp=number[first];
			number[first]=number[last];
			number[last]=temp;
			first++;
			last--;
			
		  

		}
		for(int i=0;i<number.length;i++){
		  System.out.println(number[i]);	
		}
			
	}
}
