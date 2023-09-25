package testingexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class OrangeHRMLoginSeleniumTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/vanshpatel/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		Wait<WebDriver> wait = new WebDriverWait(driver, 3);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")));
//		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		String expectedResult = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actualResult = driver.getCurrentUrl();
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedResult, actualResult);
		softAssert.assertAll();
	}
}
