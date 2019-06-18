
class ConstructorParam {
	int id;
	String name;
	int age;
	
	ConstructorParam(int i,String s){
		id=i;
		name=s;
	}
	ConstructorParam(int i,String s, int a){
		id=1;
		name=s;
		age=a;	
	
	}
	void display(){
		System.out.println(id+" "+name+" "+age);
	}

public static void main(String[] args) {
		ConstructorParam c = new ConstructorParam(111,"Sameer");
		ConstructorParam c1 = new ConstructorParam(222,"Jamil",34);
		c.display();
		c1.display();

	}

}
