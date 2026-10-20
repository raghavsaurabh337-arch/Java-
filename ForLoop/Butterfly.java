class Butterfly{
	public static void main(String[] arhs){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			
			for(int p=5;p>i;p--){
				System.out.print("  ");
			}
			for(int q=1;q<=i;q++){
			System.out.print("*");

				
			}
			System.out.println();

		}
		for(int i=1;i<5;i++){
			for(int j=5;j>i;j--){
				System.out.print("*");
			}
			//System.out.println();
			for(int p=1;p<=i;p++){
				System.out.print("  ");
			}
			for(int q=5;q>i;q--){
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
}