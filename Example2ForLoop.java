/* Program which prints the following output
 *    3 2 1
 *    2 1
 *    1
 */

package Assignment2;

public class Example2ForLoop {

	public static void main(String[] args) {
		for(int row=3;row>=1;row--)            // For incrementing the row values
		{
			for(int col=row;col>=1;col--)      // For printing the column values
			{
				System.out.print(col+" ");
			}
			System.out.println();             // To come the cursor to the next line
		}
	}

}
