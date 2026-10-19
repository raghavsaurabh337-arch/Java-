import java.util.Scanner;
class MarskGrade{
	public static void main(String[] ags){
		Scanner sc =new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>=0 && marks<=100){
			switch(marks/10){
			case 1:
				System.out.println("A");
				break;
		   case 2:
				System.out.println("B");
				break;
		   case 3:
				System.out.println("C");
				break;
		case 4:
				System.out.println("D");
				break;	
		default:
			System.out.println("F");
				
		}
			
		}
		else{
			System.out.println("plz Enter you marks 0 to 100");
		}
		
	}
}