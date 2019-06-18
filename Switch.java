
public class Switch {

	public static void main(String[] args)
	{
		int month=7;
		String stringMonth="";
		switch(month)
		{
		case 1:
			stringMonth="1-Jan";
			break;
		case 2:
			stringMonth="2-Feb";
		case 7:
			stringMonth="7-July";
			break;
			default:
				System.out.println("Invalid_Month");
				break;
		
		}
		
		System.out.println(stringMonth);
		}
		}
