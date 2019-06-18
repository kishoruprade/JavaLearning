package Patterns;

public class Pattern6 {

	public static void main(String[] args) {
		for(int row=3;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}

	}

}
