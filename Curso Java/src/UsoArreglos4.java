
public class UsoArreglos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = new int[4][5];
		
		matrix[0][0] = 15;
		matrix[0][1] = 21;
		matrix[0][2] = 18;
		matrix[0][3] = 9;
		matrix[0][4] = 33;
		
		matrix[1][0] = 34;
		matrix[1][1] = 6;
		matrix[1][2] = 12;
		matrix[1][3] = 45;
		matrix[1][4] = 8;
		
		matrix[2][0] = 76;
		matrix[2][1] = 82;
		matrix[2][2] = 3;
		matrix[2][3] = 8;
		matrix[2][4] = 27;
		
		matrix[3][0] = 41;
		matrix[3][1] = 6;
		matrix[3][2] = 9;
		matrix[3][3] = 55;		
		matrix[3][4] = 41;
		
		/*int matrix[][]{
			{15,21,18,9,33},
			{},
			{},
			{}
		}*/
		
		/*for (int i=0;i<4;i++){
			
			for (int j=0;j<5;j++){
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}*/
		
		for (int[]fila:matrix){
			
			for(int z:fila){
				
				System.out.print(z+" ");
			}
			System.out.println("");
		}
	}

}
