package polymorphism;

public class Tools {
	int getToolCost(){
		return 0;
	}

}
class Selenium extends Tools{
 int getToolsCost(){
	 return 1000;
 }  
	
}
class QTP extends Tools{
	 int getToolsCost(){
		 return 5000;
	 }

}
class SOAPUI extends Tools{
	int getToolsCost(){
	return 10000;
	}
}