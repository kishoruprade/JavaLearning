package initial;
class Employee
{
int id;
String name;
Employee(int i,String n)
{
 id=i;
 name=n;
 
}
public void printMessage()
{
System.out.println("id:"+id +" \nname:"+name);	
}
}


public class Test
{
public static void main(String[] args) 
{
	
	Employee obj=new Employee(10, "sharad");
	obj.printMessage();
		}

}
