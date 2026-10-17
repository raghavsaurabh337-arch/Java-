import java.util.Scanner;

class IF_Else
{
	public static void main(String []arg){
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name=");
		name =sc.nextLine();
		System.out.println("Enter your Age=");
		age =sc.nextInt();
		
		if (22==age){
			System.out.println(name+ " Yor are Age vaild "+age);
		}
			else if(20==age){
				System.out.println(name+ " Yor are Age vaild "+age);
			}
			else if(19==age){
				System.out.println(name+ " Yor are Age vaild "+age);
			}
			else if(18<=age){
				System.out.println(name+ " Yor are Age Just vaild  "+age);
			}
		
		else{
				System.out.println(name+ " Yor are not age vaild "+age);
			
		}   
		
		
		
	}
}