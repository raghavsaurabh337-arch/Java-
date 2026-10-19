import java.util.Scanner;
class ReverseOrder{
	public static void main(String[] age){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		int i=number;
		while(i>=1){
			System.out.println(i);
			i--;
		}
	}
}