package incapsulation;

public class AccessIncapsulation extends Incapsulation {

	public static void main(String[] args)
	{
		AccessIncapsulation inst=new AccessIncapsulation();
		inst.setName("sharad pokale");
		System.out.println("Name of the person is: "+inst.getName());
		
		
		Incapsulation obj=new Incapsulation();
		obj.setName("sharad");
		System.out.println("Name of the person is: "+obj.getName());
		

	}

}
