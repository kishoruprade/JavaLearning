
class TestRectangle1 {

	int length;
	int width;
	
	void insert(int l,int w){
		length=l;
		width=w;
	}
	void calculatedArea(){System.out.println(length*width);}

}
public  class TestRectangle12{
	public static void main(String[] args) {
		TestRectangle1 r= new TestRectangle1();
		TestRectangle1 r1 =new TestRectangle1();
		r.insert(12, 12);
		r1.insert(5, 4);
		r.calculatedArea();
		r1.calculatedArea();
		

	}
}
