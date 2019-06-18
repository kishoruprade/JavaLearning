
public class PassingArrayToMethod {

	public static void main(String[] args) 
	{
	  sum(new int[] {10,20,30}); 	
      
	}
	public static void sum(int[] numbers)
	{
		int total=0;
		for(int num:numbers)
		{
			total=total+num;
			
		}
		System.out.println();
	}

}
