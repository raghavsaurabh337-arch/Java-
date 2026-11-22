import java.util.*;
class RemoveDuplicate{
	void Remove(){
		int[] arr={3,4,5,6,2,2,3,5,3,6,5,3,8};
		for(int i=0;i<arr.length;i++){
			 boolean duplicate = false;
			 for(int j=0;j<i;j++){
				 if(arr[i]==arr[j]){
					 duplicate=true;
					 break;
				 }
			 }
			 if(!duplicate){
			 System.out.println(arr[i]);
			 }
		}
		
			
		
		
		
	}
public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	 RemoveDuplicate obj=new RemoveDuplicate();
	 obj.Remove();
	
}
}