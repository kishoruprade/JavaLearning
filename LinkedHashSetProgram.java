package set;

import java.util.*;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		// Create New LinkedHashSet and add elements
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Arun");
		lhs.add("Javed");
		lhs.add("Naveen");
		lhs.add("Kajal");
		lhs.add("Arun");
		lhs.add("Javed");
		
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
