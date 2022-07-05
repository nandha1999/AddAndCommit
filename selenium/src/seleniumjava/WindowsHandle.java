package seleniumjava;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.id("home"));
		Thread.sleep(2000);
		button.click();
		Thread.sleep(5000);
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("The parent window handle is "+parentWindow);
		
		Set<String> allWindows=driver.getWindowHandles();
		List<String> everyWindows=new ArrayList<String>(allWindows);
		
		driver.switchTo().window(everyWindows.get(1));
		
		//System.out.println("The current url is "+ driver.getTitle());
		
		driver.switchTo().window(parentWindow);
		
		WebElement multipleButton=driver.findElement(By.id("multi"));
		multipleButton.click();
		Thread.sleep(3000);
		
		allWindows=driver.getWindowHandles();
		everyWindows=new ArrayList<String>(allWindows);
		
		for(int w=0;w<everyWindows.size();w++) {
			driver.switchTo().window(everyWindows.get(w));
			System.out.println("The title of "+w+"st window is "+driver.getCurrentUrl());
		}
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	
		
		
		
	}

}

