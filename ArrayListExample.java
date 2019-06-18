package arraylist;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
	 ArrayList <String> arrList = new ArrayList<String>();
	 arrList.add("Aman");
	 arrList.add("Aman1");
	 arrList.add("Aman2");
	 arrList.add("Aman3");
	 arrList.add("Aman32");
	 
	 for (String m: arrList){
	     System.out.println(m.substring(1,4));
		 System.out.println(m.length());
		 System.out.println(m.lastIndexOf("n"));
		 System.out.println(m.charAt(0));
		 System.out.println(m.contains("1"));
		 System.out.println(m.replace("n", "n Verma"));
		 System.out.println(m.toUpperCase());
		 System.out.println(m.split("1")); 
	     System.out.println(m);
	 }
	 
	// Object obj = getObject();          The Object class is the parent class of all the classes in java by default. 
	 //In other words, it is the topmost class of java.
	 

	}

}
