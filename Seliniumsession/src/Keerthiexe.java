import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keerthiexe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://m.uber.com/");
		 driver.manage().window().maximize();
		 
		 WebElement phonenumber=driver.findElement(By.id("mobile"));
			
			phonenumber.sendKeys("4165557946");
			
			driver.findElement(By.id("next-button")).click();
			
	   WebElement password=driver.findElement(By.id("password"));
				
				password.sendKeys("uber1234");
				
				driver.findElement(By.id("next-button")).click();
				
        driver.findElement(By.className("bq ch bo bt bu bl"));
        
        
				
				
		
				
				
		
				
			

		 
	}

}
