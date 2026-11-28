/* 3. Create two classes A and B. Declare a default variable in class A and access it from class B.
*/

class Declare{
	String name="saurabh singh raghav";
	int age=23;
}

class DefaultVariableAccess{
	public static void main(String[] args){
		Declare obj=new Declare();
		System.out.println("name "+obj.name +"  "+obj.age );
	}
}