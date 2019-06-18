package infostretch;

public class Pattern {

	public static void main(String[] args) {
		
		//star program 5 to 1
		for (int i=1;i<=5;i++){
			for (int j=i;j<=5;j++){
				System.out.print("*");		
							}
			System.out.println();
		}
		
		// star pattern 1 to 5
		for (int i=1;i<=5;i++){
			for (int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		//print 1to 5
		for (int i=1;i<=5;i++){
			for (int j=i;j<=5;j++){
				System.out.print(j);				
			}
			System.out.println();
		}
		
		
		
	}

}
