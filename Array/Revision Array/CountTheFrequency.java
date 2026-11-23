
//Count the frequency of a given element in an array. 
import java.util.Scanner;
class  {
	publCountTheFrequencyic static void main(String[] args){
		int []arr={3,4,6,4,5,2,5,7,8,9,6,7,4,3};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		int count =0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==number){
				count++;
			}
		}
		 System.out.println(number + " frequency = " + count);
	}
}