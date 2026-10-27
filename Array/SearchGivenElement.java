// 7. Search for a given element in an array.
import java.util.*;
class SearchGivenElement{
	public static void main(String[] arga){
		Scanner sc =new Scanner(System.in);
		int number[]={23,43,4,67678,867,433,545,75665,32};
		System.out.println("Enter tha given Element:");
		int targetElement=sc.nextInt();
		for(int i=0;i<number.length;i++){
			if(number[i]==targetElement){
				System.out.print("Target Element  is found:"+targetElement);
				break;
			}
						
		}
		
		
}
}