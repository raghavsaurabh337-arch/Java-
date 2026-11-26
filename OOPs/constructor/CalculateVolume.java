/* 15. Create a Box class and calculate volume using constructor overloading.
*/
class Box{
	Box(float length, float width, float height){
		float	 calculate=length*width*height;
		System.out.println(calculate);
	}
}
class CalculateVolume{
	public static void main(String [] rags){
		Box myobj=new Box(3,4,5);
	}
}