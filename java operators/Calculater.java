import java.util.Scanner;
class Calculater{
	public static void main(String []args){
		int num1;
		int num2;
		int operater;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the your first number :");
		num1 =sc.nextInt();
		System.out.print("Enter the your Second  number :");
		num2 =sc.nextInt();
		
		System.out.print("Enter you choice operater  :");
		operater =sc.nextInt();
		if(operater==1){
			System.out.println(num1+num2);
		}
		else if(operater==2){
			System.out.println(num1-num2);
		}
		else if(operater==3){
			System.out.println(num1*num2);
		}
		else if(operater==4){
			System.out.println(num1/num2);
		}
		else{
			System.out.print("invalid operater");
		}

		
		
	}
}