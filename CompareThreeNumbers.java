package firstPackage;

public class CompareThreeNumbers {

	public static void main(String[] args) {
		
		// To print the status of the numbers
		int a=40,b=30,c=30;   // Initializing the three numbers
		if(a>b && a>c){
			System.out.println("A is greater");
			if(b==c)
				System.out.println("B & c are equal");
			
		}else if(b>a && b>c){
			System.out.println("B is greater");
			if(a==c)
			System.out.println("A And C are equal");
			
			}else if(c>b &&c>a){
				
			System.out.println("C is greater");
			if(a==b)
				System.out.println("A And B is equal");
		}else if((a==b) &&(b==c))
		{
			System.out.println("All are equal");
		}
		else if(a==b)
		{
		    System.out.println("A and B are equal");
		    if(c>a)
		    {
			System.out.println("C is greater");
		    }else
		    {
		    	System.out.println("C is smaller");
		    }
			}
		else if(b==c)
		{
			
			System.out.println("B and C are equal");
			if(a>b) {
			System.out.println("A is greater");
			}
			else
			{
				System.out.println("A is smaller");
			}
		}else if(a==c)
		{
			System.out.println("A and C are equal");
			if(b>a)
			{
			System.out.println("B is greater");}
			else
			{
				System.out.println("B is smaller");
			}
		}
	}

}
