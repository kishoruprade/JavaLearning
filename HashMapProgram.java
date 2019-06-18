package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

	public static void main(String[] args) {
		// Create a HashMap and add the key and value
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		hm.put(101, "Naveen");
		hm.put(102, "Sameer");
		hm.put(103, "Arun");
		hm.put(104, "Madhav");
		hm.put(105, "Aban");
		
		for (Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
		
	}

}
