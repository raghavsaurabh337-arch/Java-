/*Create a class with both default and parameterized constructors.*/
class constructors{
	constructors(){
		System.out.println("Hye my name is saurabh singh raghav");
	}
	constructors(int number){
		System.out.println(number);
	}
	constructors(int l,int w){
		int area=l*w;
		System.out.println(area);
	}
}

class DefaultParameterized{
	public static void main(String[] args){
	constructors obj1= new constructors();
	constructors obj2= new constructors(34);
	constructors obj3= new constructors(2,3);
	}
}