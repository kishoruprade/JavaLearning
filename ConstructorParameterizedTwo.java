
public class ConstructorParameterizedTwo {
	int id;
	String name;
	int age;
	
	ConstructorParameterizedTwo(int i, String n,int a){
		id = i;
		name = n;
		age=a;
	}
	
	void display(){System.out.println(id+" "+name+" "+age);}

	public static void main(String[] args) {
		//ConstructorParameterizedTwo cs = new ConstructorParameterizedTwo(111,"Aryan");

		ConstructorParameterizedTwo cs1 = new ConstructorParameterizedTwo(222,"Sameer",345);
		//cs.display();
		cs1.display();

	}

}
