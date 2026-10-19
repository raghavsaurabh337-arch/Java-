import java.util.Scanner;
class TrafficLightSystem{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color ('red','green','yellow')");
		String inputColor=sc.nextLine().toLowerCase();
		
		switch(inputColor)
		{
			case "red":
				System.out.println("STOP");
				break;
			case "green":
				System.out.println("GO`");
				break;
			case "yellow":
				System.out.println("wait");
				break;	
			default:
				
				System.out.println("invaild color");
		}
				
		
	}
}