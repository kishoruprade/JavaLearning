package list;
import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Shankar");
		al.add("Kali");
		al.add("Amit");
		al.add("Sujay");
		al.add("Jeevan");
		al.add("Jeevan");
		al.add("Omkar");
		al.add(1,"Arjun");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}  

}
