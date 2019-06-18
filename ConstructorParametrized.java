
public class ConstructorParametrized {
	int id ;
	String name;
	int tag;
	
	ConstructorParametrized(int i, String Name,int tag){
		
		id = i;
		name = Name;
		this.tag=tag;
	}
	
	void display(){System.out.println(id+" "+name+" "+tag);}

	public static void main(String[] args) {
		ConstructorParametrized cP = new ConstructorParametrized(111,"Sameer",456);
		ConstructorParametrized cP2=new ConstructorParametrized(222,"Ajany",567);
		cP.display();
		cP2.display();

	}

}
