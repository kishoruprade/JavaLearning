class Person
{ 
	int fund=10000;
}
class Employee extends Person
{
int salary=30000;	
}


public class Programmer extends Employee {
int bonus=10000;
	public static void main(String[] args) 
	
	{
		Programmer obj=new Programmer();
		
		System.out.println("Salary is "+obj.salary);
		System.out.println("Bonus is "+obj.bonus);
		System.out.println("Fund is "+obj.fund);

	}

}
