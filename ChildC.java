package inheritance;

public class ChildC  extends ParentC{
	
	int childVar = 40;
	public static void main(String[] args) {
		ChildC c = new ChildC();
		System.out.println(c.parentVar);
		System.out.println(c.childVar);
	}
}
