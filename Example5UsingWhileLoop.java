/*  Program which prints the following output using while loop
 * 
 *  3 2 1
 *  2 1
 *  1
 */

package Assignment2;

public class Example5UsingWhileLoop {

public static void main(String[] args) {
	  
	int row1=3,row2=2,row3=1;      //Initialized required variables
	  while(row1>=1)               //printing the first row   
	  {
		  System.out.print(row1+" ");
		  row1--;
	  }
	  System.out.println();       // to come the cursor to second line
	  while(row2>=1)              // Printing the second row
	  {
		  System.out.print(row2+" ");
		  row2--;
	  }
	  System.out.println();         // Coming the cursor to the third line
	  while(row3>=1)
	  {
		  System.out.print(row3+" ");
		  row3--;
	  }

	}

}
