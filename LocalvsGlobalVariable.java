package common;

public class LocalvsGlobalVariable {
	
	//define global variable
	 String name = "Kshitiz";
	 static String lastname = "Mohare";
	int age = 28;
	

	public static void main(String[] args) {
		int i = 10;   //local variable
		System.out.println(i);
		
		LocalvsGlobalVariable obj = new LocalvsGlobalVariable();
		
		System.out.println(lastname);
		
		System.out.println(obj.name);
		System.out.println(obj.sum());

	}
	public int sum(){
		int i = 10;
		int j = 20;
		int age = 25;
		return i;
	}

}
