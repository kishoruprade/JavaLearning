package Patterns;

public class Pattern3 {

	public static void main(String[] args) {
		for(int row=1;row<=3;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
