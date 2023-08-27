import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionsExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement rtclk = driver.findElement(By.xpath("//*[text()='right click me']"));
		Actions a = new Actions(driver);
		
		a.moveToElement(rtclk).perform();
		a.contextClick().perform();
		Thread.sleep(3000);
		
		WebElement dblclk = driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
		a.doubleClick(dblclk).perform();
		

	}

}
