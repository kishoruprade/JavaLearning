package practicePrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0,c;
		int b = 1,count=12;         //
		
		System.out.print(a+ " "+b);
		
		for (int i=2;i<count;i++){
			c=a+b;
			if(c<100){                    //Find the series till 100
			System.out.print(" "+c);
			a=b;
			b=c;
			}
			
		}
		

	}

}
