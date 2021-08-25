package session1;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Session1 {
	public static void main(String args[]) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.google.com");
	
	String actualresult= driver.getTitle();
	String exceptedresult= "Google";
	
	if(actualresult.equalsIgnoreCase(exceptedresult))
			{
	System.out.println("page title displayed as excepted");
	}
	else {
		System.out.println("page title noy displayed as excpeted");
	}
			

	}
	

}
