
public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 float n1 = 500, n2 = 300.4f, maximum;
		 maximum =  greater(n1,n2);
		 System.out.println("The maximum number is: "+maximum);
		 System.out.println("The maximum number is: "+greater(44,55.1f));
	}
	public static float greater(float num1, float num2){
		float result;
		if(num1>num2)
		{
			result = num1;
		}
		else{
			result = num2;
		}
		return result;
	}

}
