// 9. Find the second-largest element.
import java.util.*;
class SecondLargest{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int array[]={23,21,56,34,75,780,45};
		int largest=array[0];
		
		int secondlargest = array[0];
		System.out.println(secondlargest);
		for(int i=0;i<array.length;i++){
			if(array[i]>largest){
				secondlargest=largest;
				largest=array[i];
						
			}
			else if(array[i]>secondlargest && array[i]!=largest){
				secondlargest = array[i];
			}
		}
		
		System.out.println("largest"+largest);
		System.out.println("second-largest: "+secondlargest);
	}
}