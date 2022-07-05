package seleniumjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nandhakumar.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		
		WebElement multipleButtons=driver.findElement(By.id("multi"));
		
		multipleButtons.click();
		
		Set<String> windowId=driver.getWindowHandles();
		List<String> windowIds=new ArrayList<String>(windowId);
		
		System.out.println("The old url of the window after clicking the multiplebutton variable is : "+driver.getCurrentUrl());
		
		
		
		driver.switchTo().window(windowIds.get(2));
		
		System.out.println("The new url of the window after we have switched to the driver to the new browser is : "+driver.getCurrentUrl());
		
		
		for(String s:windowIds) {
			String currentUrlTitle=driver.switchTo().window(s).getCurrentUrl();
			if(currentUrlTitle.contains("https://letcode.in/alert")) 
			{
				Thread.sleep(2000);
				driver.close();
				Thread.sleep(2000);
				
			}
		}
		//driver.quit();
		

	}

}
