package seleniumjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.ThreadSafe;

public class WindowsNavigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\nandhakumar.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
		
		driver.findElement(By.id("home")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		
		driver.quit();
		
		

	}

}
