import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class studentHeadless {

	public static void main(String[] args) {
		ChromeOptions c = new ChromeOptions();
		c.addArguments("headless");
		ChromeDriver driver = new ChromeDriver(c);
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
