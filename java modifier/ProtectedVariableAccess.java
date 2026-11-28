/* 4. Create a Person class with a protected variable age and access it from another class in the same package.
*/
class Person{
	protected int age=23;
}


class ProtectedVariableAccess extends Person{
	public static void main(String[] args){
		Person obj=new Person();
		System.out.println(obj.age);
		
	}
}