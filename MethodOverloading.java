package polymorphism;

public class MethodOverloading {
	//Rule: 1within a same class
	void add(){	}
	
	//Rule 2: same method but different # of parameter (# = numbers)
	void add(int a){}
	void add(int a, int b){}
	void add(int a, int b, int c){}
	
	//Rule 3: same method name, same # of parameters, order is different
	void add(String a, int b){}
	void add(int b, String a){}
	
	
	//Rule 4: same method name, same # of parameters, data type is different
	//char add(char a, char b){}
	
	//Rule 5: Return type does not matters
	//void add(char a, char b){}

}
