package functionPkg;

public class AccessClass 
{
	public static void staticMethod()
	{
		System.out.println(StaticClass.staticVar);
		InstanceClass inst = new InstanceClass();
		System.out.println(inst.nonStatVar);
	}
	public void nonStaticMethod()
	{
		System.out.println(StaticClass.staticVar);
		InstanceClass inst = new InstanceClass();
		System.out.println(inst.nonStatVar);
	}

}
