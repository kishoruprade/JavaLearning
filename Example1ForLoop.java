/*   Program which prints the following output
 * 
 *   3 2 1
 *   3 2
 *   3
 */
package Assignment2;

public class Example1ForLoop {

	public static void main(String[] args) {
		        
           		for(int row=1;row<=3;row++)      // For incrementing the row values
           		{
           			for(int col=3;col>=row;col--) //For printing the column values
           			{
           				System.out.print(col+" ");   
           			}
           			System.out.println();
           			
           		}

	}

}
