import java.util.*;

class StringNameUser{
public static void main(String[] ags)
{
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter your names:");
	String name[]=new String[5];
	for(int i=0;i<name.length;i++){
		name[i]=sc.nextLine();
		
	}
	System.out.println("Name Print: ");
	for(int i=0;i<name.length;i++){
		String names=name[i].toUpperCase();
		System.out.println(names);
	}
}
	
}