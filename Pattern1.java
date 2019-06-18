package Patterns;

public class Pattern1 {

	public static void main(String[] args) {
		
		 /*  1 2 3
		 *   1 2 3
		 *   1 2 3
		 */
		for(int row=1;row<=3;row++)
		{
			
			for(int col=1;col<=3;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
