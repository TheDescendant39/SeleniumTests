package testingexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailSignUpSeleniumTest {
	public static void main(String args[] ) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/vanshpatel/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("----------Start of Test-----------\nOpnening Gmail Home Page");
		driver.get("https://www.google.com/gmail/about/");
		Thread.sleep(5000);
		
		System.out.println("Clicking on 'Create New Account'");
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[3]")).click();
		Thread.sleep(3000);
		
		System.out.println("Entering firstName = SampleName");
		driver.findElement(By.id("firstName")).sendKeys("SampleName");
		
		System.out.println("Entering lastName = SampleLastName");
		driver.findElement(By.id("lastName")).sendKeys("SampleLastName");
		
		System.out.println("Clicking on Next Button");
		driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button")).click();
		Thread.sleep(3000);
		
		System.out.println("Selecting Month of Birth = January");
		Select birthMonth = new Select(driver.findElement(By.id("month")));
		birthMonth.selectByValue("1");
		
		System.out.println("Entering Day of Birth = 10");
		driver.findElement(By.id("day")).sendKeys("10");
		
		System.out.println("Entering Year of Birth = 1997");
		driver.findElement(By.id("year")).sendKeys("1997");
		
		System.out.println("Selecting Custom Gender");
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByValue("4");
		Thread.sleep(2000);
		
		System.out.println("Entering Gender = Sample");
		driver.findElement(By.xpath("//*[@id=\"customGender\"]/div[1]/div/div[1]/input")).sendKeys("Sample");
		
		System.out.println("Selecting gender pronoun = Male");
		Select pronoun = new Select(driver.findElement(By.id("genderpronoun")));
		pronoun.selectByValue("1");
		
		System.out.println("Clicking on Next button");
		driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button")).click();
		Thread.sleep(2000);
		
		System.out.println("Selecting custom gmail option");
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/span/div[3]")).click();
		
		System.out.println("Entering Username = sample23431");
		driver.findElement(By.name("Username")).sendKeys("sample23431");
		
		System.out.println("Clicking on Next button");
		driver.findElement(By.xpath("//*[@id=\"next\"]/div/button")).click();
		Thread.sleep(2000);
		
		System.out.println("Entering password");
		driver.findElement(By.name("Passwd")).sendKeys("SamplePass!23");
		
		System.out.println("Re-entering password");
		driver.findElement(By.name("PasswdAgain")).sendKeys("SamplePass!23");
		
		System.out.println("Clicking on Next Button \n -----------End of Test----------");
		driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button")).click();
		Thread.sleep(10000);
		driver.close();
		
		
	}
}
