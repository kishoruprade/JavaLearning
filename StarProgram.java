
public class StarProgram {

	public static void main(String[] args) {
		/*
		 *     
		 *     1
		 *   2 1 2
		   3 2 1 2 3
		 
		     1
		   2 1
		 3 2 1
		   2 1
		     1
		 */
		
		 for (int row = 1; row<=3;row++)
		 {
			 for (int space = 3;space>row;space--)
			 {
				 System.out.print(" ");
			 }
			 for (int col= row;col>=1;col--)
			 {
				 System.out.print(col);
			 }
			 for (int rightCol=2;rightCol<=row;rightCol++)
			 {
				 System.out.print(rightCol);
				
			 }		 
			  System.out.println();
		 }

	}

}
