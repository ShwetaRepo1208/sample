import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectdropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		WebElement day =driver.findElement(By.id("day"));
		Select s= new Select(day);
		s.selectByIndex(5);
		
		WebElement mon =driver.findElement(By.id("month"));
		Select s1= new Select(mon);
		s1.selectByIndex(8);
		
		WebElement year =driver.findElement(By.id("year"));
		Select s_yr= new Select(year);
		s_yr.selectByVisibleText("2018");
		

	}

}
