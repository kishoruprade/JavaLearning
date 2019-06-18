package interfaceClass;

interface Printable{
	void print();
}

interface Showable{
	void show();
}

public class InterfaceDeclaration implements Printable,Showable{
	
	public void print(){
		System.out.println("Implement interface method");
	}
	public void show(){System.out.println("Implement show method");}

	public static void main(String[] args) {
		//Access implemented interface
		InterfaceDeclaration id = new InterfaceDeclaration();
		id.print();
		id.show();

	}

}
