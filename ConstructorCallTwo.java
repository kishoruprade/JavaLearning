/*
 * 1. Write a program which should allow the user to specify values for a, b and c
 *  It should call the constructor to compute a solution of the addition.
 *  If no error occurs, it should print the “you are correct”.
 */
public class ConstructorCallTwo {
	int a,b,c;
	
	ConstructorCallTwo(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void add(){
		System.out.print("Compute the three numbers: ");
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		ConstructorCallTwo c = new ConstructorCallTwo(10,20,30);
		c.add();
	}

}
