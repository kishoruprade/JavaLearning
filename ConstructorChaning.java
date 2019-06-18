/*
 * Write a program to constructor chaining, where calculate %, where fixed % value set from parent class, 
 * and calculation should happen in child class.
 */
public class ConstructorChaning {
	int num;
	int per;
	
	ConstructorChaning(int n,int p){
		this(5);
		num=n;
		per=p;
		p=n/100*100;
	}
	ConstructorChaning(int n){
		num=n;
		n = n/100*100;
		System.out.println(n);
			}
	
		

	public static void main(String[] args) {
		ConstructorChaning c = new ConstructorChaning(9);

	}

}
