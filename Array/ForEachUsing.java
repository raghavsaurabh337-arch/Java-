class ForEachUsing{
	public static void main(String[]args)
	{
		String[] car={"Thar","BMW","xy","xyz"};
		car[1]="saurabh";
		for(String cars:car){
			System.out.println(cars);
		}
	}
}