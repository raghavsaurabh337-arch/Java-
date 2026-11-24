/*Create an Employee class and initialize id and name using a constructor.*/
import java.util.*;
class Employee{
	int id ;
	String name;
	Employee(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	void display(){
		System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
	}
}
class EmployeeName{
public static void main (String[] args){
	Scanner sc=new Scanner(System.in);

System.out.println("Enter tha Employee id and name:");
int id=sc.nextInt();
String name =sc.next();
Employee obj=new Employee(id,name);
obj.display();

}
}