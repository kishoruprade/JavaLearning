package practicePrograms;

public class MaximumTwoNumber {
	public static void main(String[] args) {
		// declare an array of type integer which holds 10 values
		int[] arr = {2,4,5,6,11,7,10,3,2,9};
		int max = 0;
		int max2 = 1;
		
		for(int i=1;i<arr.length;i++){
			if (arr[i]>max){
				max = arr[i];
			}
			if (arr[i]>max2 && arr[i]<max){
				max2=arr[i];				
			}
		}
		System.out.println("First largest number: "+max);
		System.out.println("Second largest number: "+max2);			
	}
}
