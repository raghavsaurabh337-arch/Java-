/* Create a function that takes a number and returns its square.*/
import java.util.*;
class calculateNUmber{
	int square(int number){
		return number*number;
	}
	int cube(int number){
		return number*number*number;
	}
}
class SquareNumber{
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	calculateNUmber obj=new calculateNUmber();
	System.out.println("Enter the number:");
	int number=sc.nextInt();
	System.out.println("square of this number"+number+ "=" +obj.square(number));
	System.out.println("cube of this number"+number +"=" +obj.cube(number));
	
}

}