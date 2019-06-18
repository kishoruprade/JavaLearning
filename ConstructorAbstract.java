package constructor;

public class ConstructorAbstract implements ABD {
	public ConstructorAbstract(int a){
		System.out.println("Abstract constructor");
	}
	public void ConstructorAbstract(){
	
	}
	
	public void add(){
		System.out.println("implement addmethod");
	}
	public static void main(String[] args) {
		ConstructorAbstract aca = new ConstructorAbstract(10);
		aca.add();

	}

}

interface ABD {
	
	void add();
	
}
