/*7. Create a Circle class and calculate the area using radius.
*/

class Circle{
	Circle(int radius){
		double area = Math.PI * radius * radius;
		
		System.out.println(area);
		
		
	}
}
class CalculateCircle{
	public static void main(String[] args){
		Circle myObj=new Circle(3);
	}
}