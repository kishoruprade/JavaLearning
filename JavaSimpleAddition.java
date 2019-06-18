package basic.javaPrograms;

public class JavaSimpleAddition {
	int a;
	String b;
	static String c = "ITS";
			

	public  JavaSimpleAddition(int a, String b){
		this.a = a;
		this.b=b;
		System.out.println("Default constructor");
		
	}
	public void add(){
		System.out.println("callinng add method" +a +b + c);
	}
	
	public static void main(String[] args) {
		System.out.println(10+20+"JavatPoint");
		System.out.println("JavatPoint"+10+20);
		JavaSimpleAddition ja = new JavaSimpleAddition(1, "Sameer");
		ja.add();
		

	}

}

