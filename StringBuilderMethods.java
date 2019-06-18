package stringPractice;

public class StringBuilderMethods {

	public static void main(String[] args) {
		StringBuilder sbu = new StringBuilder("Hello");
		
		//append methods
		sbu.append(" Java");
		System.out.println(sbu);
		
		//insert methods
		sbu.insert(10, " Welcome to JavatPoint");
		System.out.println(sbu);
		
		//replace methods
		sbu.replace(6, 11, "Selenium ");
		System.out.println(sbu);
		
		//delete method
		sbu.delete(0, 6);
		System.out.println(sbu);
		
		//reverse method
		sbu.reverse();
		System.out.println(sbu);
		
		//emptystring
		System.out.println(sbu.length());
		sbu.delete(0, 30);
		System.out.println(sbu);  // deleted all the character of string
		sbu.trimToSize();
		
		//capacity method
	    StringBuilder sb = new StringBuilder();
	    System.out.println(sb.capacity());
	    sb.append("Hello");
	    System.out.println(sb.capacity());
	    sb.append("Java is my favorite language");
	    System.out.println(sb.capacity());
	    
		
		

	}

}
