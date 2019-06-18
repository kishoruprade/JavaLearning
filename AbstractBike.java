
abstract class Bike{
	abstract void run();
	
}

class AbstractBike extends Bike{
	void run(){System.out.println("Bike is running..");}

	public static void main(String[] args) {
		Bike obj = new AbstractBike();
		obj.run();

	}

}
