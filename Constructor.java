
public class Constructor {
	Constructor(){
		System.out.println("Hello");
	}
	public Constructor(int a){
		System.out.println("hello1");
	}

	public static void main(String args[]){
		Constructor instance = new Constructor(10);
		System.out.println("constructor");
		//void.add();
	}
}
