package hashMap;

import java.util.*;

public class TreeMapProgram {

	public static void main(String[] args) {
		// Create TreeMap and add key and value
		TreeMap<Integer, String> tm = new TreeMap<Integer,String>();
		tm.put(101, "JaiRam");
		tm.put(102, "JaiRaj");
		tm.put(103, "JaiGhosh");
		tm.put(100, null);
		
		for(Map.Entry m:tm.entrySet()){
			System.out.println(m.getKey()+" " +m.getValue());
		}
	}

}
