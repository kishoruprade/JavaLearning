package practicePrograms;

public class Array {

	public static void main(String[] args) {
	int[] arr = new int[5];
	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;
	arr[3] = 30;
	arr[4] = 40;
	
	System.out.println(arr[4]);
	System.out.println("-----------");
	for(int a: arr)
	{
		
		System.out.println(a);
	}

	System.out.println("-----------");
	int count =0;
	for (int i=0;i<arr.length;i++)
	{
		count = arr[i];
		System.out.println(count);
	}
	
	System.out.println("-----------");
	int count2 =0;
	for (int i=0;i<arr.length;i++)
	{
		count2 = arr[i];
	   if (count2==20){
		   System.out.println(count2);
	   }
	}

	}

}
