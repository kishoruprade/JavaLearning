
public class FibonacciSeries {

	public static void main(String[] args) {
		// Fibonacci Series
		
		int a = 0;
		int b = 1;
		int c ;
		
		
		System.out.println("The Fibonacci Series is: "+"/n"+a+" "+b);
		for(int i=1;i<15;i++){		
			
			c=a+b;
			if(c<100){
			System.out.println(c);
			a=b;
			b=c;
			
			}
		}
		

	}

}
