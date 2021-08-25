package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demolocators {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoh\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("http://automationpractice.com/index.php");
	 
	driver.manage().window().maximize();	//to maximize the web page its optional
	
	//ID and name locators we have used below
	
	WebElement searchbox=driver.findElement(By.id("search_query_top"));
	
	searchbox.sendKeys("T-shirts");
	
	driver.findElement(By.name("submit_search")).click();
    
	//linktext
	//driver.findElement(By.linkText(""))
	}

}
