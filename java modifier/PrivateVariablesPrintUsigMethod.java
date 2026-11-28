/* 5. Create a Car class with private variables brand and price. Print them using a method.
*/
class Car{
	private String brand="SQV700";
	private String colors="Black";
	private double price=1000000;
	void brand(){
		System.out.println(brand);
		System.out.println(price);
	}
}
class PrivateVariablesPrintUsigMethod{
	public static void main(String [] args){
		Car obj=new Car();
		obj.brand();
		
	}
}