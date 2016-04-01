package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {

	WebDriver driver;

	@Test
	public void f() {
		driver.findElement(By.name("q")).sendKeys("Kishore");
		driver.findElement(By.name("btnG")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
