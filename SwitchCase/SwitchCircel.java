import java.util.Scanner;
class SwitchCircel{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Seclte menu : ");
		System.out.println("1.Rectangle ");
		System.out.println("2.Square ");
		System.out.println("3. Triangle : ");
		System.out.println("4. Exit: ");
		
		System.out.println("Choice the number enter");
		int number=sc.nextInt();
		switch(number){
			case 1:
				System.out.println("Enter the number length:");
				int length=sc.nextInt();
				System.out.println("Enter the number width:");
				int width=sc.nextInt();
				int rectangle=length*width;
				System.out.println(rectangle);
				break;
			case 2:
				System.out.println("Enter the number Square:");
				int square=sc.nextInt();
				int squareArea=square*square;
				System.out.println(squareArea);
				break;
			case 3:
				System.out.println("Enter the number base:");
				int base=sc.nextInt();
				System.out.println("Enter the number hight:");
				int hight=sc.nextInt();
				double triangleArea=0.5*base*hight;
				System.out.println(triangleArea);
				break;
			case 4:
				System.out.print("");
				
				break;
			default:
				System.out.println("Invaild Number");
				
				
		}
		
		
		
	}
}