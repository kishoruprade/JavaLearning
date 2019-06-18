
class A{
	private int  data = 40;   // is not visible outside the class
	private void msg(){            //is not visible outside the class
		System.out.println("Hello Java");
	}
}
public class PrivateA {

	public static void main(String[] args) {
		A obj = new A();
		//System.out.println(obj.data); //compile time error
		//obj.msg();  //compile time error
		

	}

}
