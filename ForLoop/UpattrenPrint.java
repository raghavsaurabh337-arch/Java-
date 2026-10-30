/*	* - - * 
	* - - *
	* - - *
	* - - *
	* * * *
*/

class UpattrenPrint{
	public static void main(String [] args){
		int row=5;
		int coloums=4;
		for(int i=0;i<row;i++){
			for(int j=0;j<coloums;j++){
				if(i==4 || j==3 || j==0 ){
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