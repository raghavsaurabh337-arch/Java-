import java.util.Scanner;
class TwoAbsMethod{
	public static void main(String[] args){
		int age;
		Scanner se=new Scanner(System.in);
		System.out.println("Enter you Age:");
		age =se.nextInt();
		int ageAbs=Math.abs(age);
		if(ageAbs>=18){
			System.out.println("you are allow to Pen ");
		}
		else{
			System.out.println("you are not allow to Pen ");

		}
	}
}