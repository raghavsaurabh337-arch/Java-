import java.util.*;
class TwoPowMethod{
	public static void main(String[] args){
		int baisevalues;
		int powerValues;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entet your valuse of baise");
		baisevalues=sc.nextInt();
		System.out.println("Entet your valuse of Power");
		powerValues=sc.nextInt();
		
		double output=Math.pow(baisevalues,powerValues);
		
		System.out.println(output);
	}
}