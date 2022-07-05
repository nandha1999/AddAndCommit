import java.awt.AWTException;
import java.awt.Dimension;
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

public class GetScreenshot {

	public static void main(String[] args) throws IOException, AWTException {
		// How to take screenshot even when handling an alert box;
		// Taking Screenshot using robot class
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
		

		Robot robot = new Robot();
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(dimension);
		BufferedImage srcFile = robot.createScreenCapture(rectangle);
		File destFile = new File(".\\Data_Folder\\newss.png");
		ImageIO.write(srcFile, "png", destFile);
		
		//getting screenshot using takesscreenshot class
		
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
//		File destFile = new File(".\\Data_Folder\\screenshot.png");
//		FileHandler.copy(srcFile, destFile);
		
		System.out.println("your screenshot has been successfully taken !!!!");
		
		driver.quit();
		

	}

}
