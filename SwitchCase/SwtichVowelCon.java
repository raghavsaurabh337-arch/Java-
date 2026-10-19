
import java.util.Scanner;
class SwtichVowelCon{
	public static void main(String[] ags){
		char latter;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter tha latter:");
		latter=sc.next().toLowerCase().charAt(0);;
		switch(latter){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("vowels");
				break;
			default:	
			if(latter>='a'&&latter<='z')
			{
				System.out.println("Consonant");
			}	
				else {
					System.out.println("Invaild latter");
				}
		}
		
	}
}