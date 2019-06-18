package practicePrograms;

public class HighestNumber {

	public static void main(String[] args) {
     int[] result = {12,1,15,89};
      int max = 0;
     for (int i=0;i<result.length;i++){  //using for loop highest number
    	 if (result[i]>max){
    		 max = result[i];
    	 }
     }
     System.out.println(max);
     
	}
}
