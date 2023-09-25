package testingexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class OrangeHRMLoginSeleniumTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/vanshpatel/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
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
