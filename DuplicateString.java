package practicePrograms;

public class DuplicateString {

	public static void main(String[] args) {
		String[] str = {"java","c","c++","java"};
		int count = 0;
		
		for (int i = 0;i<str.length;i++){
			for (int j = i+1;j<str.length;j++){
				if(str[i].equals(str[j])){
					System.out.println(str[i]);
					count = count+1;
					
				}
				
			}
		}
		System.out.println(count);

	}

}
