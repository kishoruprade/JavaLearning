package math;

public class HighestNumberArray {

	public static void main(String[] args) {
		//highest number in array
		int[] arra = {2,45,3,67,5,89,3};
		int tempa = 0;
		
		for (int i=1;i<arra.length;i++){
			for (int j=i-1;j<arra.length;j++){
				if(arra[i]>arra[j]){
					tempa = arra[i];
				}				
			}			
		}
		System.out.println(tempa);
		
		//Lowest number in array
		int[] arr = {2,45,3,67,5,89,3};
		int temp = 0;
		
		for (int i=1;i<arr.length;i++){
			for (int j=i-1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp = arr[i];
				}				
			}			
		}
		System.out.println(temp);

	}

}
