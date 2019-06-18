
public class AdditionUsingAnonymousArray {

	public static void main(String[] args) 
	
	{
		sum(new int[] {10,20,30});

	}
	public static void sum(int[] numbers)
	{
		int total=0;
		for(int x1:numbers)
		{
			 total=total+x1;
		}
		System.out.println("Addition is: "+total);
	}

}
