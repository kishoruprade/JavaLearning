package interfacetest;


interface ABC {
	public int add(int x, int y);
}


public class InterfaceTest2 implements ABC {
   public static  int x, y;
	public static void main(String[] args) {
		System.out.println("Main method calling interface abstract method");
		InterfaceTest2 it = new InterfaceTest2();
		it.add(4,8);
		}
	
	public int add(int a, int b){
		x = a;
		y=b;
		int c =  a+b;
		System.out.println("Implemented add method "+c);
		return c;
		
	}

}



