
//HCL - static global variable can be used in private static or private non-static 
//But non-static variable cannot be used in static method

public class StaticPrivateTest {
	
	  static String name;
	  int age;

	public static void main(String[] args) {
		StaticPrivateTest sp = new StaticPrivateTest();
		sp.addName();
		name = "abc";
	//	age = 89;            cannot used non-static variable        

	}
	protected void addName(){
		name = "Krishna";
		System.out.println(name);
		age =18;
	}
	
	private static void removeName(){
		name = "Sameeer";
		// age = 19;       // cannot useed non-static variable
	}
	
	public void editName(){
		name = "Shyam";
		age = 34;
	}
	
	private void appendName(){
		name = "JTU";
		age = 344;
	}

}
