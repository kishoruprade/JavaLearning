
public class ParameterizeConstructor {
	int age;
	String name;
	ParameterizeConstructor(int a, String name){
		age = a;
		this.name = name;   //current class name = local variable name
	}
	
	public static void add(){
		
		ParameterizeConstructor inst1 = new ParameterizeConstructor(20, "kishor");
		 inst1 = new ParameterizeConstructor(30, "sharad");
		 inst1 = new ParameterizeConstructor(40, "jotiba");
		System.out.println(inst1.age+"is the age of" + inst1.name);
	}
	
	

}
