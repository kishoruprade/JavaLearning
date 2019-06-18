package array;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		int[] a = new int[5];  //declaration and instantiation
		a[0]=10;  //initialization
		a[1]=20;
		a[4]=70;
		a[2]=40;
		a[3]=50;
		
		for (int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("*********************");
            //****************Declaration, Instantiation and Initialization********//
		int b[] = {33,3,4,5};  //declaration, instantiation and initialization..
		
		//printing array
		for (int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
	}

}
