package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSlocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoh\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	
	//driver.findElement(By.cssSelector("#email")).sendKeys("David");
	
	//tag and id	
	driver.findElement(By.cssSelector("input#email")).sendKeys("David");
	
	//tag and class combination
	driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Manu");
	
	//tag and attribute
	//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Manu");
	driver.findElement(By.cssSelector("[name=email]")).sendKeys("Manu");
	
	//tag,class and attribute
	//driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("Manu");
	driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("Manu");
	
	
	

	}

}
