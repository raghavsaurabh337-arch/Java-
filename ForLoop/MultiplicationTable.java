// Write a Java program to print the multiplication table of a given number.
import java.util.Scanner;
class  MultiplicationTable{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valuse ;");
		int number=sc.nextInt();
		for (int i=1;i<=10;i++){
			System.out.println(number+"*"+i+"="+number*i);
		}
	}
}