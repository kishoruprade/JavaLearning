
abstract class Bike1{
	Bike1(){	System.out.println("Bike is created");	}
	abstract void run();
	void changeGear(){	System.out.println("gear Changed");	}
}

class Honda extends Bike1{
	void run(){	System.out.println("Bike is running dafely");	}
}

public class TestAbstractionConstructor {

	public static void main(String args[]) {
		Bike1 obj = new Honda();
		obj.run();
		obj.changeGear();
	}

}
