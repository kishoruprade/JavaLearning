package firstPackage;

public class Pattern1ForLoop {

	public static void main(String[] args) {
		
		
		/* for the pattern 
		 *   1
		 *   1 2
		 *   1 2 3
		 */
	     for(int row=1;row<=3;row++)     //outer loop for row      
		
	     {
			
			for(int col=1;col<=row;col++)   //Inner loop for column 
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
