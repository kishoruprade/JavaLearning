import java.io.IOException;

public class TestThrows {
	void m()throws IOException{
		throw new IOException("device error");
	}void n() throws IOException{
		m();
	} void p(){
		try{
			n();
		}catch(Exception e){System.out.println("exception handled..");}
	}
	

	public static void main(String[] args) {
		TestThrows obj = new TestThrows();
	    obj.p();
	    System.out.println("Normal flow");

	}

}
