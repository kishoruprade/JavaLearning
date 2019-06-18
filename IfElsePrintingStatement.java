//Printing the if else statement using conditions

package firstPassLogicBuilding;

public class IfElsePrintingStatement {

	public static void main(String[] args) {
	   int distance=45;
	   if((distance>0) && (distance<=100))   // when value is in between 0 to 100
	   {
		   System.out.println("Cost is 5");
	   }else if(distance>100 && distance<=500) //when value is in between 100 to 500
	   {
		   System.out.println("Cost is 8");
		   
	   }else if(distance>500 && distance<1000)  // when value is in between 500 to 1000;
	   {
		   System.out.println("Cost is 10");
		   
	   }else if(distance>=1000 )                //when value is greater than 1000
	   {
		   System.out.println("Cost is 12");
	   }
	   else                                     //when value is invalid
	   {
		   System.out.println("Invalid Distance");
	   }
	   

	}

}
