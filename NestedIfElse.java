
public class NestedIfElse {

	public static void main(String[] args) {
		int age=17;
		int weight=63;
		if(age>18)
		{
			if(weight>65)
			{
				System.out.println("You are eligible to donate the blood");
			}
			else
			{
				
				System.out.println("You are not eligible to donate the blood");
			}
		}
		else
		{
			
			System.out.println("Your age is less than 18");
		}

	}

}
