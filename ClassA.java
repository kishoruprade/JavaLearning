package functionPkg;

public class ClassA {
	
  String s = null;
	
	public void sendText()
	{
		System.out.println("non static sendText");
	}
	
   public static void click()
   {
	   System.out.println("static Click method");
   }
}
