package initial;

public class FinalParameter {
public void add( int a, final int b)
{
	a++;
    int c=a+b;
    System.out.println("Addition is:"+c);
}
	public static void main(String[] args) {
		FinalParameter obj=new FinalParameter();
		obj.add(10, 20);
		obj.add(20, 30);
	}

}
