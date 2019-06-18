package arrayconceptsession4;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		String arr[][] = new String[3][4];
		//first row
		arr[0][0] = "A";
		arr[0][1] = "B";
		arr[0][2] = "C";
		
		//second row
		arr[1][0] = "A1";
		arr[1][1] = "B1";
		arr[1][2] = "C1";
		//third row
		arr[2][0] = "A2";
		arr[2][1] = "B2";
		arr[2][2] = "C2";
		
		for (int i=0;i<arr.length;i++){
			for (int j=0;j<arr.length;j++){
				System.out.print(arr[i][j] +" " );
			}
			System.out.println();
			
		}
		
		
		System.out.println(arr[1][1]);

	}

}
