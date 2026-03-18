class TwoDArray{
	public static void main(String args[]){
		int[][] x= new int[5][2];
		x[0][0]=10;
		x[0][1]=15;
		x[1][0]=20;
		x[1][1]=25;
		x[2][0]=30;
		x[2][1]=35;
		x[3][0]=40;
		x[3][1]=45;
		x[4][0]=50;
		x[4][1]=55;
		for ( int i =0; i<5; i++){
			int y=0;
			System.out.println(x[i][y]);
			y++;
		}
	}
}