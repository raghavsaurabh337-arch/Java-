/* Sum of Each Row (Medium)*/

class MatrixSumOfEachRow
{
	public static void main(String [] args){
		int [][] number={{2,3,4},{5,6,10},{9,5,8}};
		  
	for(int i=0;i<3;i+){
		int count=0;			
		for(int j=0;j<3;j++){					
			System.out.print(number[i][j]+" ");	
         count+=number[i][j];	
	 }	
	 System.out.println(" = "+count);	
	} 						
 }
}