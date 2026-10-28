/*		* - -
		- * -
		- - *
*/

class ThirdPattren{
	public static void main(String [] args){
		int row=5;
		int coloum=5;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=coloum;j++){
				if(i==j){
					System.out.print("*");
				}
				else{
					System.out.print("-");
				}
				
			}
			System.out.println("  ");
		}
	}
}
		