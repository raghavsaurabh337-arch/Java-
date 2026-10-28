/*		* * *
		  *  
		* * *
		
		*/
		
class OnePattren{
	public static void main(String[] args){
		int row=51;
		int coloum=51;
		int div=coloum/2;
		div++;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=coloum;j++){
				if(i==1 ||i==row){
					System.out.print("*");
					continue;

				}
				
				if(j==div){
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();

		}
	}
}		