package practicePrograms;
/*
 * 
2 -- Suppose we have array of type integer and we have 10 values into array. Write a program to find out top 2 least/smaller integer value out of 10 item and print those.

 */
public class MinimumTwoNumber {

	public static void main(String[] args) {
		//declare an array of 10 values
		int[] arr = {2,4,3,8,5,6,7,90,1,9};
		int min =2;
		int min2 = 3;

		for(int i = 1;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
			if(arr[i]<min2 && arr[i]<min){
				min2 = arr[i];				
			}
		}
		System.out.println("First minimum number of array: "+min);
		System.out.println("Second minimum number of array: "+min2);
	}
}
