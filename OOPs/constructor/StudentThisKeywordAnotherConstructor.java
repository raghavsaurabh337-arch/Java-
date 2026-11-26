/* 17. Create a class where one constructor calls another constructor using this().
*/
class Student{
Student(){
	this(102,"Saurabh");
	
	
}
Student(int id){
	System.out.println("this  is constructor chaining:"+id);
}Student(int id,String name){
	System.out.println("this  is constructor chaining:"+id+" "+ name);
}



}

class StudentThisKeywordAnotherConstructor{
public static void main(String[] args){
	Student obj=new Student();
}
}