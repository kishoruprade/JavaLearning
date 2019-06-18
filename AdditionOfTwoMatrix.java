
public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		int[][] firstMatrix= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] secondMatrix={{1,2,3},{4,5,6},{7,8,9}};
		int[][] sum=new int[3][3];
		for(int row=0;row<firstMatrix.length;row++)
		{
			for(int col=0;col<firstMatrix[row].length;col++)
			{
				sum[row][col]=firstMatrix[row][col]+secondMatrix[row][col];
				if(row==2)
				{
					System.out.print(sum[row][col]+" ");
				}else
				{
				System.out.print(sum[row][col]+"  ");
			}
				}
			System.out.println();
		}

	}

}
