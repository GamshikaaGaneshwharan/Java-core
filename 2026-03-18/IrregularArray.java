class IrregularArray{
	public static void main(String args[]){
		int[][] irregularArray=new int[5][];
		irregularArray[0]=new int[3];
		irregularArray[1]=new int[4];
		irregularArray[2]=new int[2];
		irregularArray[3]=new int[4];
		irregularArray[4]=new int[3];
		
		irregularArray[0][0]=2;
	    irregularArray[0][1]=4;
		irregularArray[0][2]=6;
		
		irregularArray[1][0]=8;
		irregularArray[1][1]=10;
		irregularArray[1][2]=12;
		irregularArray[1][3]=14;
		
		irregularArray[2][0]=16;
		irregularArray[2][1]=18; 
		
		irregularArray[3][0]=20; 
		irregularArray[3][1]=22;
		irregularArray[3][2]=24; 
		irregularArray[3][3]=26; 
		
		irregularArray[4][0]=28;
		irregularArray[4][1]=30;
		irregularArray[4][2]=32; 
		
		
		for(int i=0; i<irregularArray.length; i++){
			
		
			for(int j=0; j<irregularArray[i].length; j++){
				System.out.print(irregularArray[i][j]+"");
				System.out.println();
				
				
			}
		}
	}
}
		
		
		
 		
		
		
		
		