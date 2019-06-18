
public class Private {
	
	private int privateVar = 1000;
	

}
class AccessPrivateMembers extends Private
    {
 public static void add(){
	 Private obj = new Private();
	 // System.out.println(obj.privateVar); //not able to access
	 

 }
	
	}
