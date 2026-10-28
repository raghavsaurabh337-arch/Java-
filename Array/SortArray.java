//Sort an array in ascending order without Arrays.sort()
class SortArray{
	public static void main(String [] args){
		int[] number={3,6,2,8,4,9,4,5,90};
		int sort=0;
		for(int i=0;i<number.length;i++){
			for(int j=0;j<number.length-1-i;j++){
			if(number[j]>number[j+1]){
				sort=number[j];
				number[j]=number[j+1];
				number[j+1]=sort;
				
			}	
			}
			
		}
		for(int i=0;i<number.length;i++){
			System.out.println(number[i]);
		}
	}
}