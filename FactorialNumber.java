
public class FactorialNumber {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1; // declare a integer variable which holds value 1 do not take 0
		
		for (int i = 1;i<=num;i++ ){
			fact = fact*i;
		}
       System.out.println(fact);
	}

}
