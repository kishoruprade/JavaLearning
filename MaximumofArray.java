
public class MaximumofArray {

	public static void main(String[] args) {
		int[] arr = {1,4,3,2,7};
		int max = 2;
		int max2 = 2;
		
		
		for (int i=0;i<arr.length;i++){
			if (arr[i]>max){
				max=arr[i];
			}			
		}		
		System.out.println(max);
		
		for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > max2 && arr[i] < max)
	        	max2 = arr[i];
	    }
		
		System.out.println(max2);
	}

}
