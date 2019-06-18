package initial;

public class StaticBlankFinalVariable {
	static final int data;
	static
	{
		
		data=100;
	}

	public static void main(String[] args) {
		System.out.println(StaticBlankFinalVariable.data);

	}

}
