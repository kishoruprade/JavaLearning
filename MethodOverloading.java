package encapsulation;

public class MethodOverloading {
	int a;

	public static void main(String[] args) {
		MethodOverloading methOverload = new MethodOverloading();
		methOverload.add();
		methOverload.add(10);

	}
	
	public void add(){
		int a =1 ;
		int b = 3;
		int c;
		c = a+b;
		
		
	}
	public int add(int a){
		this.a = a;
		System.out.println("abc");
		return a;
	}

}
