/*	* * * * 
	* - - *
	* * * *
	* - * -
	* - - *
*/

class RpattrenPrint{
	public static void main(String [] args){
		int row=5;
		int coloums=4;
		for(int i=0;i<row;i++){
			for(int j=0;j<coloums;j++){
				if(i==1&&j==1 || i==1&&j==2 ||i==3 && j==1 || i==3 && j==3 || i==4 && j==1 || i==4 && j==2){
					System.out.print("  ");
					//continue;
				}
				else{
				System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
}