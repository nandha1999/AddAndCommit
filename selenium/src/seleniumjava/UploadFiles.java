package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		
		WebElement homepageLink=driver.findElement(By.linkText("Go to Home Page"));
		homepageLink.click();
		Thread.sleep(3000);
		driver.navigate().back();
	
		
		WebElement link=driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String htmlLink=link.getAttribute("href");
		System.out.println("You are supposed to go to the link : "+htmlLink);
		Thread.sleep(2000);
		
		
		WebElement brokenLink=driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		String title=driver.getTitle();
		if(title.startsWith("404")) {
			System.out.println("The link is broken ");
		}
		else
		{
			System.out.println("The link is not broken ");
		}
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		homepageLink.click();
		
		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
		System.out.println("The total number of links available on the page is "+totalLinks.size());

		driver.close();
		driver.quit();
		
		
		
		
		
		

}
}
