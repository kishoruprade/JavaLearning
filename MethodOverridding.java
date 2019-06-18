package encapsulation;

public class MethodOverridding extends B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridding methoOverride = new MethodOverridding();
		methoOverride.a();
	}

}

class A{
	public void a(){
		System.out.println("abc");
	}
}

class B extends A{
	public void a(){
		System.out.println("cdb");
	}
}
