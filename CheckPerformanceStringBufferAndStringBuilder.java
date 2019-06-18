package stringPractice;

public class CheckPerformanceStringBufferAndStringBuilder {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer("Hello");
		for(int i=0;i<100000;i++){
			sb.append("JavatPoint");
		}
		System.out.println("Time taken by StringBuffer:"+(System.currentTimeMillis()-startTime)+"ms");

		
		StringBuilder sbb = new StringBuilder("Hello");
		for(int i=0;i<100000;i++){
			sbb.append("JavatPoint");
		}
		System.out.println("Time taken by StringBuilder:"+(System.currentTimeMillis()-startTime)+"ms");
	}

}
