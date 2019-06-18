package patternPrograms;

public class Pattern {

	public static void main(String[] args) {
		
		for (int i=1;i<=5;i++){
			for (int j=1;j<=i;j++){
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		System.out.println("\n\n\nLogic 2\n");
		
		for (int i=1;i<=5;i++){
			for (int j=5;j>=i;j--){
				System.out.print(j);
			}
			
			System.out.println();
		}
		
     System.out.println("\n\nLogic 3\n");
		
		for (int i=5;i<=1;i--){
			for (int j=5;j>=i;j--){
				System.out.print(j);
			}
			
			System.out.println();
		}
	}

}
