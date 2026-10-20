class AlphabetTriangle{
	public static void main(String[] aea){
		char cha='A';
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++){
				System.out.print(cha+" ");
				cha++;
			}
			System.out.println(" ");
		}
	}
}