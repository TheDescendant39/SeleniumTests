package testingexample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FileUpload {
	public static void main(String args[] ) throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "/Users/vanshpatel/Downloads/chromedriver-mac-arm64/chromedriver");
		ChromeOptions co = new ChromeOptions();
		WebDriver driver = new ChromeDriver(co);
		
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(3000);
		
		System.out.println("Clicking on Upload File");
		driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("/Users/vanshpatel/Desktop/Screen Shot 2023-07-12 at 1.56.55 PM.png");
		Thread.sleep(3000);
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_RIGHT);
		rb.keyPress(KeyEvent.VK_RIGHT);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(15000);
		driver.close();
		
		
	}
}
