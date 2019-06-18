package javaString;

import functionPkg.PublicClass;

public class Program {

	public static void main(String[] args) 
	{
		PublicClass.add();
		// selenium, QTP, SoapUI
		/*Cost is free - selenium
		 * cost 1000 10K - QTP
		 * 10k till 15k - SoapUI
		 * 
		 * PRoject having 100 TC - SoapUI
		 * 100+ & till 300 TC - QTP
		 * more than 300 then Selenium
		 * 
		 * free, TC 400+ - Selenium/QTP
		 * IF 10K, TC 1000 -soapUI
		 *      1
		 *    1 2
		 *  1 2 3		 *      
		 *        1
		 *     1   2
		 * 1   2   3
		 */
		for (int i=1;i<=3;i++)
		{
			for(int j=3;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}

		int cost = 0;
		if (cost == 0)
		{
			System.out.println("Selenium");
		}
		else if(cost>=1000 && cost<=10000)
		{
			System.out.println("QTP");
		}
		else if(cost<=15000)
		{
			System.out.println("SoapUI");
		}
		
		int project = 0;
		if (project <=100)
		{
			System.out.println("SoapUI");
		}
		else if(project>100 && project<=300)
		{
			System.out.println("QTP");
		}
		else if(project>300)
		{
			System.out.println("Selenium");
		}
		
		String s = "selenium";
		s.charAt('e');  // Error index out of bound error
		
		//size() --no size method in 
		//Method and Functions are same
		//Code reusability
		
		
	}

}
