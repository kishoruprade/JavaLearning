package basic.javaPrograms;

public class HelloWorld {
	
	private void add(){
		int a=10,  b=5;
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		System.out.println("Hello World! Welcome to the first Java Program");
		HelloWorld hw = new HelloWorld();
		hw.add();
	}

}
