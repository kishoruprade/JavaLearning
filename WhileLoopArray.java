package control.statements;

public class WhileLoopArray {

	public static void main(String[] args) {
	 int arr[] = {2,4,5,6,6};
	 
	 int i=0;
	 while(i<5){
		 System.out.println(arr[i]);
		 i++;		 
	 }
	 
	 System.out.println();

	 
	 for(int b:arr){
		 System.out.println(b);
	 }

	}

}
