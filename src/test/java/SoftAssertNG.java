import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertNG {
	
	@Test
	private void tc1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String act_url =driver.getCurrentUrl();
		SoftAssert s = new SoftAssert();
		s.assertEquals(act_url, "https://www.facebook.com/");
		System.out.println(" Facebook Page Launched");
		s.assertAll();
		
	}
	
	@Test
	private void tc2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		String act_url =driver.getCurrentUrl();
		SoftAssert s = new SoftAssert();
		s.assertEquals(act_url, "https://www.facebook.com/");
		System.out.println(" Google Page Launched");
		s.assertAll();
		
	}
	
		
			
	
	

}
