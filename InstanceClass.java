package functionPkg;

public class InstanceClass {
	int nonStatVar = 10;  //Global/non static/instance variable
	
	//Heap memory instane and non-heap memory - class meomory

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceClass inst = new InstanceClass();
		System.out.println(inst.nonStatVar);
	}
	public void substract()
	{
		System.out.println(nonStatVar);
	}

}
