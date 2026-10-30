/*	* - - * 
	* - - *
	* * * *
	* - - *
	* - - * 
*/

class IpattrenPrint{
	public static void main(String [] args){
		int row=5;
		int coloums=5;
		
		int star=row/2;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=coloums;j++){
			if(i==1|| i==coloums || j==star+1){
					System.out.print("* ");
					
				}
				
				else{
					System.out.print("  ");
				}
			}
			System.out.println("");
			
		}
	}
}