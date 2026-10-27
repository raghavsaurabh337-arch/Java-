import java.util.*;
class UserInputSum{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int sum=0;
		int[] arr=new int[5];
		 System.out.print("enter the valuse for user:");
		for(int i=0;i<arr.length;i++){
			
			 arr[i]=sc.nextInt();
			
		}
		System.out.println("valuse:");

		for(int i=0;i<arr.length;i++){
			//System.out.println(arr[i]);
		
		sum+=arr[i];

			
		}
				System.out.println("total sum of valuse:"+sum);

		
		
	}
}