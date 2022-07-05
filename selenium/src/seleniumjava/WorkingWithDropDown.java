package seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Working with dropdown using letcode website and completing all different challenges

public class WorkingWithDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nandhakumar.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement dropdownEle=driver.findElement(By.id("fruits"));
		Select select=new Select(dropdownEle);
		
		select.selectByVisibleText("Apple");
		
		WebElement dropdownEle1=driver.findElement(By.id("superheros"));
		Select select1=new Select(dropdownEle1);
		
		Thread.sleep(3000);
		select1.selectByVisibleText("Captain Marvel");
		Thread.sleep(3000);
		select1.selectByVisibleText("Captain America");
		Thread.sleep(3000);
		select1.selectByVisibleText("Batwoman");
		
		Thread.sleep(3000);
		select1.deselectByValue("ca");
		
		
		WebElement dropdownEle3=driver.findElement(By.id("lang"));
		Select select2=new Select(dropdownEle3);
		List<WebElement> allOptions = select2.getOptions();
		int size=allOptions.size();
		
//		for(WebElement s:allOptions)
//		{
//			
//			System.out.println(s.getText());
//		}
		
		int i=1;
		for(WebElement s:allOptions) {
			
			if(i==size)
			{
				s.click();
				System.out.println(s.getText());
				break;
			}
			i++;
			System.out.println(s.getText());
			
			
		}
		
		WebElement dropdownEle4=driver.findElement(By.id("country"));
		
		Select select3=new Select(dropdownEle4);
		
		select3.selectByValue("India");
		
		List<WebElement> selectedValue = select3.getAllSelectedOptions();
		
		for(WebElement s:selectedValue)
		{
			if(s.getText().equals("India"))
			{
				System.out.println(s.getText());
			}
		}
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
