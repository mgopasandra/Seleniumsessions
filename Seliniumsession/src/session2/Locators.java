package session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoh\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		//by link text
		driver.findElement(By.linkText("Form Authentication")).click();
		//by name
		driver.findElement(By.name("login")).sendKeys("manu");
		driver.findElement(By.className("radius")).click();
		driver.findElement(By.cssSelector("#password")).sendKeys();

	}

}
