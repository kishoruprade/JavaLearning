
public class UseOfThisMethod {
	
	void m(){System.out.println("This is m method ");}
	
	void n(){
		System.out.println("This is n method declariation");
		this.m();
	}

	public static void main(String[] args) {
		UseOfThisMethod th = new UseOfThisMethod();
		th.n();

	}

}
