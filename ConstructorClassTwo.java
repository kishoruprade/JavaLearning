
public class ConstructorClassTwo {
	int id = 1234;
	String name = "Sharad";
	
	void display(){
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		ConstructorClassTwo  c1 = new ConstructorClassTwo();
		ConstructorClassTwo c2 = new ConstructorClassTwo();
		
		c1.display();
		c2.display();
		

	}

}
