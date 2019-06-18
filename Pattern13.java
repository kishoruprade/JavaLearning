package Patterns;

public class Pattern13 {

	public static void main(String[] args) {
		for(int row=4;row>=1;row--)
		{
			for(int space=row;space>1;space--)
			{
				System.out.print(" ");
			}
		
		 for(int col=row;col<=4;col++)
		    {
			 
			     System.out.print(col);
		    }
		 //System.out.println();
		}
		
		
	}
}


