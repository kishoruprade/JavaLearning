class Student2{

	private String name = "abc";
	
	public String getName(){
		return name;
	}
	public void setName(String name){
	this.name = name;
		
	}
}
	public class EncapsulationStudent {
		
	public static void main(String[] args) {
		Student2 obj = new Student2();
		obj.setName("Vijay");
		System.out.println("Student Name: "+obj.getName());

	}

}
