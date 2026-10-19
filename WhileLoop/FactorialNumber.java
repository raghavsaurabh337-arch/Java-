import java.util.Scanner;
class FactorialNumber{
	public static void main(String[] ags){
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the Factorial Number");
		  int number=sc.nextInt();
		  int fact=1;
		  int i=number;
		  while(i>=1){
			  fact=fact*i;
			  
			  i--;
		  }
		  System.out.println(fact);
		
		
	}
}