//8. Count the occurrences of a given number.
import java.util.*;
class OccurrencesNumber{
	public static void main(String [] arsg){
		  Scanner sc =new Scanner(System.in);
		  System.out.println("Enter the number :");
		  int number =sc.nextInt();
		  int element[]={2,3,4,5,6,7,6,6,4,9};  
		  int count=0;
		  for(int i=0;i<element.length;i++){
			  if(element[i]==number){
				  count++;
			  }
		  }
		  if(count==0){
		  System.out.println("number  "+number+"  not found in the array:");
		  }
		  else{
			  System.out.println("number " +number+" found is array: "+count);

		  }
	}
}
