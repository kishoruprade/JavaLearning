package math;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {2,45,3,67,5,89,3};
		int temp = 0;
		
		for (int i=0;i<arr.length;i++){
			for (int j = 1;j<arr.length-i;j++){
				if (arr[j-1]>arr[j]){
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			
				System.out.print(arr[j]+" ");
			}
			
			
		}
		
		
	}

}
