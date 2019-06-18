
public class StaticClass { // Declare a public class
	int rollno;   //declare instance global variable
	String name;  //declare string global variable
	
	static String college = "ITS";  //global static variable
	
	StaticClass(int r, String n)  // Constructor with local variables
	{
		rollno = r;  //local integer variables
		name = n;   //local string variable 
		
	}
	void display(){
		System.out.println(rollno+" "+name+" "+college);  //print
	}

	public static void main(String[] args) {
		StaticClass s1 = new StaticClass(11,"Sameer");
		StaticClass s2 =  new StaticClass(12,"Amir");
		s1.display();
		s2.display();
		

	}

}
