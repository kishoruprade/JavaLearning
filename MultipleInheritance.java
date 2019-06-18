interface drawable2
{
void print();	
}
interface printable2
{
void print();	
}
class A1 implements drawable2,printable2
{
	public void print()
	{
		System.out.println("Print the message");
		
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		A1 obj=new A1();
		obj.print();

	}

}
