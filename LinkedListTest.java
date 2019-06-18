package collection;

import java.util.LinkedList;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
	LinkedList<String> al = new LinkedList<String>();
	
	al.add("Java");
	al.add("Ravi");
	al.add("Kishor");
	
	Iterator<String> itr =al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}

	}

}
