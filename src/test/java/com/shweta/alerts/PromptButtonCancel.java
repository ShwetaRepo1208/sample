package com.shweta.alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptButtonCancel {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='promtButton']")).click();
		Alert a = driver.switchTo().alert();
		
		//a.sendKeys("shweta");
		a.accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
