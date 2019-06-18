import java.util.Scanner;

public class JavaException {

	public static void main(String[] args) {
		try{
       int data = 100/0;
  
		}catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("rest of the code");
		}
		try {
			String s = null;
			System.out.println(s.length());
			
		}catch(NullPointerException e){
			System.out.println(e);
			System.out.println("null pointer exceptionxx`");
			
		}
		try{
			String s = "abc";
			int i = Integer.parseInt(s);
			
		}catch(NumberFormatException e){
			System.out.println(e);
			System.out.println("Number Format Exception");
			
		}
		try {
			int[] a = new int[5];
			a[10]=50;
		}
		catch(ArrayIndexOutOfBoundsException e){
			
		}
		try {
			int dataa= 50/0;			
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("Exception on the try block");
		}
		
		try
		{
			Scanner s =new Scanner(System.in);
			System.out.println("Enter the number");
			int num=s.nextInt();
			System.out.println(10/num);
			System.out.println("jotiba".charAt(12));	
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Hello");
		}
		catch (Exception e)
		{
			System.out.println("Hi");
		}
		System.out.println("Rest of code");


	}

}
