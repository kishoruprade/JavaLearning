package control.statements;

public class IfElseIf {

	public static void main(String[] args) {
	int user =51;
	if (user <=18){
		System.out.println("User is 18 or younger");
	}else if (user>18 && user<40){
		System.out.println("User is in between 19 and 39");
		
	}
	else if (user==45 || user==50){
		System.out.println("User is either 45 or 50");
		
	}else {
		System.out.println("User is 40 or older ");
	}

	}

}
