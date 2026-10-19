import java.util.*;
class SwitchCalculate{
	public static void main(String[] ags)
	{
	int number1;
	int number2;
	char operater;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your valuse first:");
	number1=sc.nextInt();
	System.out.println("Enter your Operater(+,-,*,/):");
	operater = sc.next().charAt(0);
	
	System.out.println("Enter your valuse second:");
	number2=sc.nextInt();
	switch(operater){
		case '+':
			int output=number1+number2;
			System.out.println(output);
			break;
			case '*':
			
			int out=number1*number2;
			System.out.println(out);
			break;
			

			case '-':
			int ans=number1-number2;
			System.out.println(ans);
			break;
			case '/':
			int result=number1/number2;
			System.out.println(result);
			break;
			default:
			
				System.out.println("Enter you are not invails");
		}	
	}
	
	
}