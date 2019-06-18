package javaString;

public class PrimNumbers {

	public static void main(String[] args) 
	{
		// Prime numbers
		
		int n = 59;
		boolean flag = false;
		
	 
		for (int i=2;i<=n/2;++i)
		{
			if (n%i==0)
			{
				flag = true;
				
			}
			
			
		}
		if (!flag)
			System.out.println(n +"number is prime");
		else
			System.out.println(n + "number is not prime");
		
		
		

	}

}
