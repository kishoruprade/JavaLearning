
public class ForLoop {
	

	public static void main(String[] args) {
		//Evenwe can we the continue statement for the label
		Outer:
			for(int i=1;i<=3;i++)
			{
				inner:
					for(int j=1;j<=3;j++)
					{
						
						if(i==j)
						{
							break Outer;
						}
						System.out.println(i+" "+j);
					}
					
				
			}
		System.out.println("You are totally outside");
		
	}
}