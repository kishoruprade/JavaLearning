package Patterns;

public class Pattern14 {

	public static void main(String[] args) {
		for(int row=1;row<=4;row++)
		{
			for(int space=4;space>row;space--)
			{
				System.out.print(" ");
			}
			for(int col=row;col>=1; col--)
			{
				System.out.print(col);
			}
			System.out.println();
		}

	}

}
