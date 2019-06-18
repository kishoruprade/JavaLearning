
public class MethodOverloading2 
{
public void add(int a, int b)
{
System.out.println(a+b);	
}
public void add(int a,float b)
{
System.out.println(a+b);	
}
public static void main(String[] args) 
{
	MethodOverloading2 obj=new MethodOverloading2();
	obj.add(10,20);
	obj.add(10,10.40f);
	
}

}
