package encapsulation;

public class EncapsulationTest {
	
	private String abc;
	private int a,b,c;
	
	public int getName(){
		return a;
	}
	
	public void setName(int age){
		a = age;
	}
	public int getID(){
		return b;
	}
	
	public void setID(int id){
		b = id;
	}
	

	public static void main(String[] args) {
		EncapsulationTest et = new EncapsulationTest();
		et.setName(10);
		et.setID(14);
		System.out.println(et.getName());
		System.out.println(et.getID());

	}

}
