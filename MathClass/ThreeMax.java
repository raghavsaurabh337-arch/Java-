import java.util.Scanner;

class ThreeMax{
	public static void main(String[] age){
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your values:");
		number=sc.nextInt();
		int output=Math.max(number,18);
		if(output<=number){
			System.out.println("you are vaild ");
		}
		else{
			System.out.println("you are not vaild ");

		}
	}
}
