import java.util.Scanner;

class Shoping{
public static void main(String [] args){
	
	boolean debit_cart=true;
	boolean username=true;
	boolean user_password=true;
	int debit_cart_number=9087878;
	int debit_cart_pin=6395;
	int debit_cart_number_user;
	int debit_cart_pin_user;
	boolean Addres=true;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the debit_cart_number_user");
	debit_cart_number_user=sc.nextInt();
	System.out.println("Enter the debit_cart_pin_user   ");
	debit_cart_pin_user=sc.nextInt();
	
	
	if(username==true&& user_password){
		System.out.println("WEL COME TO WEB SITE and Start  SHOPING ");
		if(debit_cart==true){
			System.out.println("ADD to product");
				/*else if(Addres==true){
					System.out.println("Addres all print ");
					
				}*/
						 if(debit_cart_number==debit_cart_number_user && debit_cart_pin== debit_cart_pin_user  ){
							System.out.println("you are click order button ");
						}
						else{
							System.out.println("button disbals ");
						}
			
			
		}
		else{
			System.out.println("plz use to debite cart");
			
		}
		
	}
	else{
		System.out.println("plz username and password try angin");
	}
}
}