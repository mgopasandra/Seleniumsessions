package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoaxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoh\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		//self node example-selects the current node
		String text=driver.findElement(By.xpath("//a[normalize-space()='Dish TV India Ltd.']/self::a")).getText();
		System.out.println(text);
		
		//parent node example-always one node
	     text=driver.findElement(By.xpath("//a[normalize-space()='Dish TV India Ltd.']/parent::td")).getText();
		System.out.println(text);
		
		//child node example-one or many nodes(selects all children of current node)
		List<WebElement> childs=driver.findElements(By.xpath("//a[normalize-space()='Dish TV India Ltd.']/ancestor::tr/child::td"));
				System.out.println("number of child elements:"+childs.size());
	   
				// ancestor node example-selects all ancestores (parent and grand children)
			text=driver.findElement(By.xpath("//a[normalize-space()='Dish TV India Ltd.']/ancestor::tr")).getText();
			System.out.println(text);
			
			//descendant node(children,grand children of current node)
			List<WebElement> Desencendent=driver.findElements(By.xpath("//a[normalize-space()='Dish TV India Ltd.']/ancestor::tr/descendant::*"));
			System.out.println("number of Descendent Elements:"+Desencendent.size());
			//following means selects evryething in the documnet after clsoing tag of current node
			List<WebElement> following=driver.findElements(By.xpath("//a[normalize-space()='Dish TV India Ltd.']/ancestor::tr/following::tr"));
			System.out.println("number of following Elements:"+following.size());
			
			//following sibling nodes
			List<WebElement> sibling =driver.findElements(By.xpath("//a[normalize-space()='Dish TV India Ltd.']/ancestor::tr/following-sibling::tr"));
			System.out.println("number of following sibling Elements:"+sibling.size());
			
			//preceding means selcts all elemnts beore the self node
			List<WebElement> preceding =driver.findElements(By.xpath("//a[normalize-space()='Dish TV India Ltd.']/ancestor::tr/preceding::tr"));
			System.out.println("number of preceding Elements:"+preceding.size());
			
			//preceding siblings
			List<WebElement>  sibling1 =driver.findElements(By.xpath("//a[normalize-space()='Dish TV India Ltd.']/ancestor::tr/preceding-sibling::tr"));
			System.out.println("number of preceding Elements:"+sibling1.size());
			
			
			
			driver.close();
	}

}
