package control.statements;

public class Boolean {

	public static void main(String[] args) {
		boolean user = true;
		if (user==true){   // equal sign
			System.out.println("it's true");
		}else{
			System.out.println("it's false");
		}
		
		if (!user){
			System.out.println("it's false");
		}else {
			System.out.println("it's true");
		}
	}
}
