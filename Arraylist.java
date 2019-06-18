package collection;

import java.util.*;
import java.util.Iterator;



public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();  //creating array list
		list.add("Kishor");  //adding object in the Array list
		list.add("Jotiba");
		list.add("Sharad");
		list.add("Ravi");
		
		//Traversing list through Iterator
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		

	}

}
