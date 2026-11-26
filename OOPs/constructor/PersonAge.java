/*18. Create a Person class and validate age using a constructor. If age is negative, print "Invalid Age".
*/

class Person{
	Person(int age){
	if(age<0){
		System.out.println("Invalid Age");
	
	}
	else{
		System.out.println("vaild age");
	}
	}
}

class PersonAge{
	public static void main(String[] args){
		Person myobj= new Person(9);
		
	}
}