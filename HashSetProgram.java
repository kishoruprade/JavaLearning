package set;

import java.util.*;

public class HashSetProgram {

	public static void main(String[] args) {
		// Create HashSet and add elements into it
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Sujay");
		hs.add("Santosh");
		hs.add("Hira");
		hs.add("Heram");
		hs.add("Sujay");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}

}
