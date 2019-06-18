package interviewPrograms;

public class Prime1To100 {

	public static void main(String[] args) {
	//int i =0;
	//int num = 0;
		int counter = 0;
	String primeNumber = "";
	
	for (int i=1;i<=100;i++){
		
		for (int num = i;num>=1;num--){
			if (i%num==0){
				counter = counter+1;
			}
		}
		if (counter==2){
			primeNumber = primeNumber + i + " ";
		}
	}
		
	System.out.println(primeNumber);
		
	}

}
