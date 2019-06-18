import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;

public class HelloProgram {

	public static void main(String args[]) {
	 System.out.println("Hello");
	 
	 WebDriver driver = new InternetExplorerDriver();
	 driver.get("http://www.google.com");
	 

	}

}
