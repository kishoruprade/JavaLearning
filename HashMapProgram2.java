package hashMap;

import java.util.*;

public class HashMapProgram2 {

	public static void main(String[] args) {
		// Create HashMap and add key and element
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "Kishor");
		hm.put(102, "Sameer");
		hm.put(103, "Hasan");
		hm.put(104, "Bhanu");
		hm.put(105, "Madhav");
		hm.put(106, "Amir");
		
		for (Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey() + " " +m.getValue());
			
		}
	}

}
