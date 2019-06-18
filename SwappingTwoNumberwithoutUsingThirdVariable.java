package interviewPrograms;

public class SwappingTwoNumberwithoutUsingThirdVariable {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 18;

        System.out.println("The numbers before swapping");
		System.out.print(num1 +"\t");
		System.out.print(num2 + "\n");
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1=num1-num2;
		
		 System.out.println("The numbers after swapping");
		 System.out.print(num1 +"\t");
			System.out.print(num2);

	}

}
