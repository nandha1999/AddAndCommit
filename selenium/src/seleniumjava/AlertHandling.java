package seleniumjava;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement simpleAlert=driver.findElement(By.id("accept"));
		simpleAlert.click();
		Thread.sleep(3000);
		
		
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert text: "+alert.getText());
		alert.accept();
		
		WebElement confirmAlert=driver.findElement(By.id("confirm"));
		confirmAlert.click();
		
		Thread.sleep(3000);
		
		 //alert=driver.switchTo().alert();
		 alert.dismiss();
		 
		 WebElement promptAlert=driver.findElement(By.id("prompt"));
		 alert.accept();
		 promptAlert.click();
		 
		 Thread.sleep(3000);
		 
		 //alert=driver.switchTo().alert();
		 
		 alert.sendKeys("nandha kumar");
		 alert.accept();
		 String myName=driver.findElement(By.id("myName")).getText();
		 System.out.println(myName);
		 
		 driver.quit();
		 
		
		
		
		
		
		
	}

}
