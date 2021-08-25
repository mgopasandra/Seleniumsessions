package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoh\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
	//how to class name as a locators
	int sliders=driver.findElements(By.className("homeslider-container")).size();
	System.out.println(sliders);
	
	//how to use tag name as a locator
	
	int linkers=driver.findElements(By.tagName("a")).size();
	System.out.println(linkers);

	}

}
