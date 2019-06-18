package list;

import java.util.*;

public class LinkedListProgram {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Prashant");
		al.add("Ravi");
		al.add("Ajay");
		al.add("Prashant");
		al.add("Hari");
		al.add("Hari");
		
		Iterator<String> itr =al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		Iterator<String> itr1 = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr1.next());
		}

	}

}
