class Bike{
	
	final void run(){
		System.out.println("running");
	}	
		
	
}

public class FinalKeyword  {
	
	 int speedlimit = 90;
	
	 void run(){
		  speedlimit = 400;
		  System.out.println(speedlimit);
	}

	public static void main(String[] args) {
		FinalKeyword s = new FinalKeyword();
		System.out.println(s.speedlimit);
		s.run();

	}

}
