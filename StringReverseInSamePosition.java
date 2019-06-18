package interviewPrograms;

public class StringReverseInSamePosition {

	public static void main(String[] args) {
		String s = "Welcome to Java and Selenium";
		String split[] = s.split("\\s");
		
		for (int i=0;i<split.length;i++){
			for (int j = split[i].length()-1;j>=0;j--){
				System.out.print(split[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
