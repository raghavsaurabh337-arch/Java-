/*	- * -
	- - -
	* - *
*/

class FourPattren{
public static void main(String[] args){
	int row=50;
	int coloum=50;
	int col=coloum/2;
	for(int i=1;i<=row;i++){
		for(int j=1;j<=coloum;j++){
			if(i==1&&j==col+1||i==row&&j==coloum || i==row&&j==1){
		System.out.print("*");
		 continue;
			}
			else{
				System.out.print("-");
			}
		}
		System.out.println(" ");
		}
		
	}
}

