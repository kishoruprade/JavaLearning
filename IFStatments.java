package control.statements;

public class IFStatments {

	public static void main(String[] args) {
		int age = 200;
		
		
		if (age<=18){
			System.out.println("User is 18 or younger");			
		}if(age>18 && age<=200){
			System.out.println("User is older than 18");
		}if (age>200 ){
			System.out.println("Invalid user age. Enter age range between 0-200");
		}

	}

}
