/*Create a Student class and print the student's name using a constructor.*/
import java.util.*;
class Student{
	Student(String name){
		System.out.print("A Student is "+name);
		
	}
}
class StudentNamePrint{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter tha name of student ");
		String name=sc.next();
		Student obj=new Student(name);
		
	}
}