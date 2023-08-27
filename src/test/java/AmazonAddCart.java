import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAddCart {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 
		 WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		 searchBox.sendKeys("iphone 14");
		 
		 Thread.sleep(1000);
		 
		 Robot r = new Robot();
	     r.delay(1000); 
	     
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     
	     Thread.sleep(3000);
	     
	     //Get list of web-elements with tagName  - a
	     WebElement selected_mobile = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a"));
	     Thread.sleep(2000);
	    
	     String link_href = selected_mobile.getAttribute("href");
	     
	     driver.navigate().to(link_href);
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("add-to-cart-button")).click();
	     Thread.sleep(5000);
	     	     
	     System.out.println(driver.getCurrentUrl());
	     
		 driver.quit();
		}

}
