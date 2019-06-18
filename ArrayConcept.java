package arrayconceptsession4;

public class ArrayConcept {      // Array is used to store similar data type in the system

	public static void main(String[] args) {
		//1. int array
		//lowest bound/index = 0
		//highest bound/index = n-1(n is the size of array)
		
		int arr[] = new int [5];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		arr[3] = 30;


		System.out.println(arr[0]);
		System.out.println(arr[2]);
		//System.out.println(arr[4]);    //arrayindexOutof bound
		
		System.out.println(arr.length);
		
		for (int j = 0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
		
		arr[4] = 50;
		
		for (int m: arr){
			System.out.println(m);
		}
		//double array
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 22.03;
		d[2] = 43.30;
		System.out.println(d[2]);
		
		//Character array
		char []ch = new char[3];
		ch[0]= 4;
		ch[1]= 'a';
		ch[2]= 'A';
		
		//boolean array
		boolean b[] = new boolean[3];
		b[0] = true;
		b[1] = false;
		
		
		//String Array
		String str[] = new String[3];
		str[0] = "test";
		str[1] = "Hello";
		str[2] = "World";
		
		System.out.println(str.length);
		
		//Object Array
		Object obj[] = new Object[5];
		obj[0] = 123;
		obj[1] = 123.56;
		obj[2] = "1/2/2019";
		obj[3] = 'M';
		obj[4] = "London";
		for (Object ob: obj){
			System.out.println(ob);
		}
		
		String strr = "200";
		int ad = Integer.parseInt(strr);
		System.out.println(ad);
		
	}

}
