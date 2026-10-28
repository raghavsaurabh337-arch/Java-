
/*
	* - *
	- * -
	* - *

*/
class Space{
	public static void main(String[] args){
		int firstBy=3;
		int secondBy=3;
		boolean flag=true;
		for(int i=1;i<=firstBy;i++){
			for(int j=1;j<=secondBy;j++){
	           if(flag){
				 System.out.print(" * "); 
				 flag=false;
			   }else{
				  System.out.print("   "); 
				  flag=true;
			   }
			   
			}
			System.out.println("");
			
		}
	}
}