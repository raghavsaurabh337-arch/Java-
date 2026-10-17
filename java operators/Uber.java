import java.util.*;

class Uber
{
	public static void main(String [] args){
		boolean userName=true;
		boolean userPassword=true;
		String location="NCR";
		
		if(userName==true && userPassword==true){
		System.out.println("wel come to urbe apps ");
		
			boolean onDutyButton=true;
			if(onDutyButton==true && location.equals("NCR") ){
				System.out.println("Rider come ");
			}
			else if (onDutyButton==false){
				System.out.println("this is not rider come ");
				
			}
			else{
				System.out.println("simple website show ");
			}
		}		
	
		else  {
			System.out.println("login failed  ");

		}
	}
}
