package stringExamples;

public class StringReverse {

	public static void main(String[] args) {
		String s = "Welcome to JavtPoint";		
		String[] splits = s.split("\\s");
		
		//String reverse program
		String rev = " ";
		char ch[] = s.toCharArray();
		for (int i = s.length()-1;i>=0;i--){		
			rev = rev +ch[i];			
		}
		 System.out.print(rev);
		
		 System.out.println("---------------");
		 //String reverse with original position
		 
		for (int i=0;i<splits.length;i++){
			for (int j=splits[i].length()-1;j>=0;j--){
				
			System.out.print(splits[i].charAt(j));
			}
			System.out.print(" ");
		}
         
		System.out.println(".......................");
		
		for (int i=0;i<splits.length;i++){
			for (int j=splits[i].length()-1;j>=0;j--){
				System.out.print(splits[i].charAt(j));
				
			}
			System.out.print(" ");
		}
	
	}

}
