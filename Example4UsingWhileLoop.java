/*  Program which prints the following output using while loop
 * 
 *    3 2 1
 *    3 2
 *    3 
 */
package Assignment2;

public class Example4UsingWhileLoop {

	public static void main(String[] args) {
		int row1=3,row2=3,row3=3;     //initialization of variables
		
		// Printing the first row
		while(row1>=1)
		{
			System.out.print(row1+" ");
			row1--;
		}
		System.out.println();  // for next line
        
		//printing the second row
		while(row2>=2)
        {
        	System.out.print(row2+" ");
        	row2--;
        }
        System.out.println(); // Next line
        
        //Printing the third row
        
        while(row3>=3)
        {
        	System.out.print(row3+" ");
        	row3--;
        }
	}

}
