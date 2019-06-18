package control.statements;

public class NestedIf {

	public static void main(String[] args) {
		int user = 19;
		if (user<19){
			if (user>16&&user<19){
				System.out.println("You are 17 or 18");
			}else {
				System.out.println("16 or younger");
			}
		}

	}

}
