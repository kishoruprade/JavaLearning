package initial;

public class BlankFinalVariable {
	
	final int speedlimit;
	BlankFinalVariable()    //We can only initialize the blank final variable inside the constructor only, not in method or block etc.
	{
		speedlimit=100;
		System.out.println(speedlimit);
		
	}
	

	public static void main(String[] args) {
	new BlankFinalVariable();

	}

}
