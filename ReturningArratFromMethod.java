
public class ReturningArratFromMethod {

	public static void main(String[] args) 
	{
		int total=0;
		
		int[] ar=sum();
		for(int a:ar)
		{
			total=total+a;
			
		}
		System.out.println("Addition is: "+total);

	}
	public static int[] sum()
	{
		
		 int[] arr= {10,20,30,10};
		 
		 return arr;
		 
		
	}

}
