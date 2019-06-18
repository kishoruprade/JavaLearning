package practicePrograms;

public class SmallestNumber {

	public static void main(String[] args) {
		//Declaration of array
		
		int[] arr = {11,2,5,04,99};
		
		int small = 8;
		for (int s:arr){   //Using Foreach loop
			if (s<small){
				small=s;
			}
			
		}
		System.out.println(small);

	}

}
