package stringPractice;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome");
				
		// check the append method
		sb.append(" JavatPoint");
		System.out.println(sb);
		
		//Check insert methods
		sb.insert(0, "Java Selenium ");  // First is index number then append text 
		System.out.println(sb);
		
		//replace method
		sb.replace(0,5,"Hello ");
		System.out.println(sb);
		
		//delete method
		sb.delete(5, 14);
		System.out.println(sb);
		
		//reverse method
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		
		//capacity method		
		System.out.println(sb.capacity());
		sb.append(" Java");
		System.out.println(sb);
		System.out.println(sb.capacity());

	}

}
