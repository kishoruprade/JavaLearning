
public class ClassAssignment {

	public static void main(String[] args) {
		/*
		 *   1
		   2 1
		 3 2 1
		   2 1
		     1
		 */
		for (int row = 1; row<=3;row++)
		{
			for (int space = 3;space<1;space--)
			{
				System.out.println(" ");
			}
			for(int col = row;col>=1;col--)
			{
				System.out.print(col);
			}
			
			System.out.println();
			
		}

	}

}
