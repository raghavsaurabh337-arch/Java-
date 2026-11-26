/* Create a Student class and use the this keyword inside the constructor.*/
class Student{
	int id;
	String name;
	Student(int id, String name){
	this.id=id;
	this.name=name;
	}
	void display(){
		System.out.println("Student is id "+this.id);
		System.out.println("Student is name "+this.name);
	}
}

class StudentUsingKeyword{
public static void main(String[] args){
	Student ob=new Student(23,"saurahb");
	ob.display();
}
}
