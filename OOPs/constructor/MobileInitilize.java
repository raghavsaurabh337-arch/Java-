/*5. Create a Mobile class and initialize name, price, and RAM using a constructor.*/
class Mobile{
	String name;
	int price;
	int ram;
	Mobile(String name, int price, int ram){
		this.name=name;
		this.price=price;
		if(ram==4||ram==8||ram==10){
			this.ram=ram;
		}
		else{
			System.out.println("Plz RAM is right Size");
		}
		
	}
	void main(){
		System.out.println("Name "+name+ " ,Price "+price + " ,RAM "+ram+"GB");
	}
	
	
}
class MobileInitilize{
	public static void main(String [] ars){
		Mobile myObj=new Mobile("saurabh",6678,8);
		myObj.main();
		
	}
}