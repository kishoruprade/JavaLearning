
public class FindMaximumNumber {

	static int arr[] = {10,34,67,99};
	
	static int largest(){
		int i;
		int max = arr[0];
		
		for (i=1;i<arr.length;i++)
			if(arr[i]>max)
			
				max = arr[i];
				
			return max;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Largest of a given array is: "+largest());

	}

}
