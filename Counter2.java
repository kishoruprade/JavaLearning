
public class Counter2 {
	
	static {
		int a;
		int c;
		System.out.println("abc");
	}

	static int count =0;
	int a;
	
	Counter2(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		Counter2 c = new Counter2();
		Counter2 c1 = new Counter2();
		Counter2 c3 = new Counter2();
		

		

	}

}
