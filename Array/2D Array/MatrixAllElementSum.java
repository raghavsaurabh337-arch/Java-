/*Sum of All Elements (Easy)
Ek 3×3 matrix ke sabhi elements ka sum find karo.*/
class MatrixAllElementSum
{
	public static void main(String [] args){
		int [][] number={{2,3,4},{5,6,10},{9,5,4}};
		int count=0;
	for(int i=0;i<3;i++){
		int count+=number[i];
		System.out.print(count);
		for(int j=0;j<3;j++){
			System.out.print(number[i][j]+" ");
			count+=number[i][j];
		}
		System.out.println("");
		
	}
	System.out.println("Total sum of : "+count);
							
	}
}