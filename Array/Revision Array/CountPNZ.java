/* Count positive, negative and zero elements.*/
class CountPNZ{
	public static void main(String [] args){
	int [] number={0,0,0,23,1,212,54,65,-9,-8,7};
	int countZore=0;
	int countPos=0;
	int countNe=0;
	for(int i=0;i<number.length;i++){
		if(number[i]==0){
			countZore++;
		}
		else if(number[i]>=0){
		  countPos++;
		}
		else {
			countNe++;
		}
	}
		System.out.println("Zore :"+countZore);
		System.out.println("negative :"+countNe);
		System.out.println("Posit:"+countPos);
	
}
}