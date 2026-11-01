import java.util.*;
class RevisionArray{
	public static void main(String[] args){
		int[] number={2,3,4,5,6};
		number[0]=22;
		int value[]= new int[5];		
		for(int i=0;i<number.length;i++){
			value[i]=number[i];
			value[2]=44;	
			System.out.println("orignal:"+number[i]);
			
		System.out.println(value[i]);
		}
		
	}
}