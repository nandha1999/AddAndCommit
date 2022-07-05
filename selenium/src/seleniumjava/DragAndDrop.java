package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		
		Thread.sleep(2000);
		Actions builder=new Actions(driver);
		builder.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
		Thread.sleep(2000);
		
//		Actions builder=new Actions(driver);
//		Thread.sleep(2000);
//		builder.dragAndDrop(draggable, droppable).build().perform();
//		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
