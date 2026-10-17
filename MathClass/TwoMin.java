class TwoMin{
	public static void main(String [] arg){
	String firstName="Saurabh";
	String lastName="Raghavhjcin";
	int length1=firstName.length();
	int length2=lastName.length();
	int output=Math.min(length1,length2);
	if(output==length1){
		System.out.println(firstName);
	}
	else{
		System.out.println(lastName);

	}
}
}