package practicePrograms;

public class PrimeOneToHundred {

	public static void main(String[] args) {
	int flag = 0;
	int num = 0;
	
	for (int i=0;i<100;i++){
		if(i==0||i==1) {
			System.out.println(i+": Number is not prime");
		}
		else if(i%num==0){
			System.out.println("Number is not prime");
			flag =1;
		}else if(flag==0)
		{
			System.out.println("Number is prime");
		}
		
	}

	}

}
