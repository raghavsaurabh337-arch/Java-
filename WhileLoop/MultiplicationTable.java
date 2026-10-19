import java.util.Scanner;
class MultiplicationTable{
	public static void main(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the multiplication of Table : ");
		int number=sc.nextInt();
		int i=1;
		while(i<=10){
			System.out.println(number+"*"+i+"="+number*i);
			i++;
		}
	}
}