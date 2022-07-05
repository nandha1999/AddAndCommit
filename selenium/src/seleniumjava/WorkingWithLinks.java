package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nandhakumar.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("The total number of links found in this webpage is "+allLinks.size());
		
		int i=1;
		
		for(WebElement l:allLinks)
		{
			System.out.println("The "+i+"st element of this webpage is "+l.getAttribute("href"));
			i++;
		}
		
		driver.quit();
		

	}

}
