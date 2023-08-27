import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertionNG {
	
	@Test
	private void tc1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "https://www.facebook.com/");
		System.out.println("Web Page Launched Successfully");
	}
	@Test
	private void tc2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver_tc2 = new ChromeDriver();
		driver_tc2.get("https://www.google.co.in/");
		String actual = driver_tc2.getCurrentUrl();
		Assert.assertEquals(actual, "https://www.google./", "Wrong URL");
		System.out.println("Page Launched");
	}
}
