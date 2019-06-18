package stringExamples;

public class StringReverseExample3 {

	public static void main(String[] args) {

       String originalString="knoledgeware classes";
       
       System.out.print("Reverse String is: ");
       
       for(int i=originalString.length()-1;i>=0;i--)
       {
    	   System.out.print(originalString.charAt(i));
       }

	}

}
