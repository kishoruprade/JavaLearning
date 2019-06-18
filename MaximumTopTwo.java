package practicePrograms;
/*
 * 1 – Suppose we have array of type integer and we have 10 values into array. Write a program to find out top 2 maximum integer value out of 10 item and print those.
 */
public class MaximumTopTwo {

	public static void main(String[] args) {		
		// declare an array of type integer which hold 10 values		
		int[] arr = {13,2,3,89,51,67,7,5,6,10}; 
		int max = 0;		
		
		for(int i=1;i<arr.length;i++){    //traverse the array till array length	
			if (arr[i]==89)  	{    // first highest value comparison
				System.out.println("1st biggest value "+arr[i]);
			}
			if (arr[i]==51)   //second highest value comparison
			{
				System.out.println("2nd biggest value "+arr[i]);
			}					
		}		
	}
}
	
		
	


