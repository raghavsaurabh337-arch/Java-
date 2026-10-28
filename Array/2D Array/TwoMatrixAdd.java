class TwoMatrixAdd{
	public static void main(String[] args){
		int[][] oneMatrix={{2,3,4,5},{3,4,5,6}};
		int[][] twoMatrix={{2,3,4,5},{3,4,5,6}};	
		int[][] result= new int[2][3];
		for(int i=0;i<2;i++){
				for(int j=0;j<3;j++){
					result[i][j]=oneMatrix[i][j]+twoMatrix[i][j];
					System.out.print(result[i][j]+" ");
				}
				System.out.println(" ");
		}
	}
}