package accessSpecifiers;

class PrivateClassTestOne {
	private int data = 40;
	private void message()
	{
		System.out.println("Hello Java");
	}
	public static void main(String[] args)
	{
		PrivateClassTestOne obj = new PrivateClassTestOne();
		System.out.println(obj.data);
		obj.message();
	}

}
