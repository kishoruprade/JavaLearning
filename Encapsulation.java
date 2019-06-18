package encapsulation;

public class Encapsulation {
		private String name;   // declare a private instance/global variable
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setName("Kishor");
		System.out.println(e.getName());

	}

}
