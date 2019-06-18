package firstPackage;

public class Pattern1WithWhile {

	public static void main(String[] args) {
		/* for the pattern 
		 *   1
		 *   1 2
		 *   1 2 3
		 */
		
		// for the first row
	    int i=1;        
		while(i<=1)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		// for the second row
		int j=1;
        while(j<=2)
        {
        	System.out.print(j+" ");
        	j++;
        }
        System.out.println();
        
        //For the third row
        int k=1;
        while(k<=3)
        {
        	System.out.print(k+" ");
        	k++;
        }
	}

}
