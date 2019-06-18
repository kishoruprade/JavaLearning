package control.statements;

public class ForEachLoop {

	public static void main(String[] args) {
		int arr[] = {12,10,13,14};
		int count =0;
		
		for (int i:arr){
			System.out.println(i);
			count = count+1;		
					}
		System.out.println("\n"+ count);
		
	}

}
