/*Create a function that counts vowels in a string.*/
import java.util.*;
class CountVowels{
	void Count(String name){
		int count=0;
		for(int i=0;i<name.length();i++){
			char cha = name.charAt(i);
			
		if(cha=='a'||cha=='i'||cha=='e'||cha=='o'||cha=='u'){
			count++;
			System.out.print(name.charAt(i));
		
		}
      
		
		}
		  System.out.print(" Total vowels"+count);
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		CountVowels obj=new CountVowels();
		System.out.println("Enter the String name:");
		String name=sc.next();
		obj.Count(name);
	}
}