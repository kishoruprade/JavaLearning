package incapsulation;

public class Incapsulation2
{

private String name;
private double salary;
private int id;

public int getEid() {
	return id;
}
public void setEid(int eid) {
	this.id = eid;
}
public String getEname() {
	return name;
}
public void setEname(String ename) {
	this.name = ename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public static void main(String[] args)
{
	Incapsulation2 obj=new Incapsulation2();
	obj.setEid(52461);
	System.out.println("Employee Id: "+obj.getEid());
	obj.setEname("sharad pokale");
	System.out.println("Employee name: "+obj.getEname());
	obj.setSalary(34000.45);
	System.out.println("Salary: "+ obj.getSalary());
}
}

