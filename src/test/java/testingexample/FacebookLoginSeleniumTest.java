package testingexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class FacebookLoginSeleniumTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/vanshpatel/Downloads/chromedriver-mac-arm64/chromedriver");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.binary", "/Users/vanshpatel/Downloads/chrome-mac-arm64 2/Google Chrome for Testing.app");
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Vansh");
		driver.findElement(By.name("lastname")).sendKeys("Seleniumtest");
		driver.findElement(By.name("reg_email__")).sendKeys("vanshpt09s+seleniumtest@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vanshpt09s+seleniumtest@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("samplepassword");
		
		Select birthdayMonth = new Select(driver.findElement(By.name("birthday_month")));
		birthdayMonth.selectByVisibleText("Sep");
		
		Select birthdayDay = new Select(driver.findElement(By.name("birthday_day")));
		birthdayDay.selectByVisibleText("3");
		
		Select birthdayYear = new Select(driver.findElement(By.name("birthday_year")));
		birthdayYear.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("//input[@name='sex'][@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(15000);
		driver.close();
//		driver.findElement(By.xpath("//button[@type = \'submit\']")).click();
	}

}
