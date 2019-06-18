package array;

public class MultiDimensionArrayAddition {

	public static void main(String[] args) {
		// declaring two matrices
		int a[][]={{2,3,4},{3,4,3},{3,3,2},{3,4,3}};
		int b[][]={{2,3,4},{3,4,5},{5,2,2},{3,4,5}};
		
		//Creating another matrices to store sum of two matrices
		int c[][]=new int[4][3];
		
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"   ");				
			}
			System.out.println();			
		}
		
		}
}
