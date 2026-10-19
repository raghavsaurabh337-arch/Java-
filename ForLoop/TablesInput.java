// input start and end given values , print the Tables
import java.util.Scanner;
class TablesInput{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter tha valuse start: ");
		int start=sc.nextInt();
		System.out.print("Enter tha valuse End: ");
		int end=sc.nextInt();
		int innerTable=start;
	    for(int i=1;i<=10;i++){
			for(int j=start;j<=end;j++){
				int multiValue=j*i;
				System.out.print(j+"*"+i+"="+multiValue+" ");
				if(multiValue<=end){
					System.out.print(" ");
				}
			}
			System.out.println(" ");
			
		}
		
	}
}