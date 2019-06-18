interface printable
{
void print();	
}
class Print implements printable
{
public void print()
{
System.out.println("Print the page");	
}
}
public class Interface {

	public static void main(String[] args) {
		Print p=new Print();
		p.print();

	}

}
