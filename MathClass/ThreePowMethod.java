import java.util.*;
class ThreePowMethod{
	public static void main(String[] args){ // user Input
		int baisevalues;
		int powerValues;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entet your valuse of baise");
		baisevalues=sc.nextInt();
		System.out.println("Entet your valuse of Power");
		powerValues=sc.nextInt();
		
		double output=Math.pow(baisevalues,powerValues);
		if(baisevalues==2){
			System.out.println("Squr"+output);
		}
		else
		{
			System.out.println("other:"+output);

		}
	}	
	
}