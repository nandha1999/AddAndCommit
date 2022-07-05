package seleniumjava;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub\
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\nandhakumar.s05\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		
		driver.manage().window().maximize();
		
//		TakesScreenshot screenshot=(TakesScreenshot) driver;
//		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
//		File destinationFile=new File(".\\snaps\\nandha.png");
//		
//		FileHandler.copy(sourceFile, destinationFile);
		
		//How to take screenshot using robot class under the package  of java.awt
		
		Robot robot=new Robot();
		Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(dimension);
		BufferedImage sourceFile=robot.createScreenCapture(rectangle);
		File destinationFile=new File(".\\snaps\\newScreenshot.png");
		ImageIO.write(sourceFile, "png", destinationFile);
		
		
		
		driver.quit();
		
	}

}
