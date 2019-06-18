package list;

import java.util.*;

public class ArrayListProgram {

	public static void main(String[] args) {
	//Declaration of ArrayList
		ArrayList<String> list =  new ArrayList<String>();    //Creating ArrayList
        list.add("Prashant");
        list.add("Aarti");
        list.add("Ravi");
        list.add("Ajay");
        list.add("Vijay");
        list.add("Sanju");
        list.add("Sanju"); 
        //Traversing list Through Iterator 
        Iterator<String> itr =list.iterator();
      
        
       
        while (itr.hasNext()){
        	System.out.println(itr.next());
        }
        
        
	}

}
