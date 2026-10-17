import java.util.Scanner;
class ThreeMin{
	public static void main(String[] agr){
		String password;
		int lenght=8;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter you password: ");
		password=sc.nextLine();
		
		int passwordLength=password.length();
		int outout=Math.min(passwordLength,lenght);
		
		
		if(outout==lenght){
			System.out.println("Save you passwords"+outout);
		}
		else{
			System.out.println("plz enter your password 8 lengh");
		}
		
	}
}