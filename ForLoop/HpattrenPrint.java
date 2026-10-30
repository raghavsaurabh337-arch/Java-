/*	* - - * 
	* - - *
	* * * *
	* - - *
	* - - * 
*/

class HpattrenPrint{
	public static void main(String [] args){
		int row=5;
		int coloums=5;
		int star=row/2;
		
		
		for(int i=1;i<=row;i++){
			for(int j=1;j<=coloums;j++){
			if(j==1 || j==coloums || i==star+1){
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