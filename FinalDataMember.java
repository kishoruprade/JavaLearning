package initial;
class Bike5
{
int speedlimit=90;	
}
class Splendor4 extends Bike5
{
int speedlimit=50;	
}
public class FinalDataMember  {

	public static void main(String[] args) {
		Bike5 obj=new Splendor4();
		//System.out.println(obj.speedlimit);
		System.out.println(obj instanceof Bike5);

	}

}
