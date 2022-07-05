package seleniumjava;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropSelenium {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/drop.html");
	driver.manage().window().maximize();
	
	
	// Using Actions class to drag and drop WebElements
	
//	WebElement draggable = driver.findElement(By.id("draggable"));
//	WebElement droppable = driver.findElement(By.id("droppable"));
//	
//	Actions action = new Actions(driver);
//	action.clickAndHold(draggable).moveToElement(droppable).release().perform();
//	
//	action.dragAndDrop(draggable, droppable).perform();
//	
//	Thread.sleep(3000);
	
	File downloads = new File("C:\\Users\\nandhakumar.s05\\Downloads");
	File files[] = downloads.listFiles();
	for(File file:files)
	{
		if(file.getName().equals("receiverconfig"))
		{
			System.out.println("The file was successfully downloaded");
			break;
		}
	}
	driver.quit();
	

	}

}
		