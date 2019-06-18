package variable;

class Bike{
	final void run(){
		System.out.println("Bike is running");
	}
}

public class FInalMethod extends Bike {	

/*
	    void run(){                                             //Compile time error
		 System.out.println("running safely with 100kmph");
	 }
	 
	 */
	public static void main(String[] args) {
		FInalMethod fm = new FInalMethod();
		fm.run();         
		

	}

}

