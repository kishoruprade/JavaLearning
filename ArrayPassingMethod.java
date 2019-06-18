package array;

public class ArrayPassingMethod {
	
	//Find the largest and Smallest Number of Array

	static void min(int arr[]){
		int min = arr[0];
		for(int i=1;i<arr.length;i++)
			if(min>arr[i])
				min=arr[i];				
				System.out.println(min);		
	}
	
	public static void main(String[] args) {
		int a[]={33,3,4,5,2,11,12,1};
		min(a);   //print smallest number from array
		max(a);  //Print third largest number from array

	}
	
	static void max(int arr[]){
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
			if(max<arr[i])
				max=arr[i];	           //First largest number identified
		
		int maxSecond= arr[1];
		for(int i=1;i<arr.length;i++)
			if(maxSecond<arr[i] && max>arr[i])
				maxSecond=arr[i];               //Second largest number identified
		
		int maxThird=arr[2];
		for(int i=1;i<arr.length;i++)
			if(maxThird<arr[i] &&maxSecond>arr[i])
				maxThird=arr[i];                  //Third largest number identified
		
		
		System.out.println(maxThird);
	}
	
}
