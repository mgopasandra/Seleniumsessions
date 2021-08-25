package pavanclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
	 public static  void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\manoh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://automationpractice.com/index.php");
	     driver.manage().window().maximize();
	     
			/// By ID locator
		WebElement serachbox=driver.findElement(By.id("search_query_top"));// The returned element we can store in a variable
		serachbox.sendKeys("T-shirts");
		
		///by Name locator
		driver.findElement(By.name("submit_search")).click();
		
		//link text and partial link test
		
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		
		
		
		
	 }

}
