import java.util.Scanner;

class SwitchCase{
	public static void main(String []args){
		char world;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice value :");
        world = sc.next().charAt(0);
		switch(world){
				case 'A':				
					System.out.println("Apple");
					break;
					
					
					
				break;
				case 'B': 
					System.out.println("Boy");
				break;
				case 'C':
					System.out.println("Cat");
				break;
				case 'D':
					System.out.println("DOg");
				break;
				default:
					System.out.println("Enter your char invalid:");
		}
		
	}
}