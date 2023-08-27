import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameSample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		List<WebElement> count_tot = driver.findElements(By.tagName("iframe"));
		int s = count_tot.size();
		System.out.println("Total frames-" +s);
		Thread.sleep(2000);
		driver.switchTo().frame("frm2");
		WebElement login = driver.findElement(By.id("firstName"));
		login.sendKeys("Besant");
		
		driver.switchTo().parentFrame();
		WebElement bye=driver.findElement(By.id("name"));
		bye.sendKeys("Bye bye");
		
		
		
	}

}
