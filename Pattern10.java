package Patterns;

public class Pattern10 {

	public static void main(String[] args) {
		for(int row=5;row>=1;row=row-2)
		{
			for(int col=1;col<=row;col=col+2)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
