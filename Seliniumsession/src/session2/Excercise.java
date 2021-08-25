package session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoh\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElements(By.linkText("Google"));
		
		//driver.findElement(By.id("email")).sendKeys("manu");   //username using ID
		
		//////driver.findElement(By.name("pass")).sendKeys("trynew"); // passowrd using name
		
		//driver.findElement(By.xpath("//button[@name='login']")).click();  //login button using xpath
		
		
		
		
		

		
		
		

	}

}
