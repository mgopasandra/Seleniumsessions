package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadowdomex1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoh\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	driver.get("https://books-pwakit.appspot.com/");
	driver.manage().window().maximize();
	
	WebElement root=driver.findElement(By.tagName("book-app"));//shadow host/root element
	
	JavascriptExecutor Js=(JavascriptExecutor)driver;  //to get shadowdom we need type java scrpit executor lowercase 
	
	WebElement shadowDom1=(WebElement) Js.executeScript("Return argumnet[0].shadowRoot",root);
	
	WebElement appheader=shadowDom1.findElement(By.tagName("app-header"));
	
	WebElement apptoolbar=appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
	
	WebElement bookinputdecorator=apptoolbar.findElement(By.tagName("book-input-decorator"));
	
	bookinputdecorator.findElement(By.cssSelector("input#input")).sendKeys("testing");
	
	
	}

}
