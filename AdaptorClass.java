package inheritance;
interface Tp
{
void m1();
void m2();
void m3();
}
class Adaptor implements Tp
{
public void m1() {}
public void m2() {}
public void m3() {}
}
class NewLast extends Adaptor
{
	public void m1()
	{
		System.out.println("M1- method");	
	}
}
public class AdaptorClass {

	public static void main(String[] args)
	{
		NewLast obj=new NewLast();
		obj.m1();
		obj.m2();
		obj.m3();
	}

}
