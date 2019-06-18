
public class NestedForLoop {

	public static void main(String[] args) {
		for(int i=0;i<=9;i++)
		{
			
			for(int j=0;j<=9;j++)
			{
				if(i==j)
				{
					System.out.println(i+" "+j);
				}
				continue;
			}
		}

	}

}
