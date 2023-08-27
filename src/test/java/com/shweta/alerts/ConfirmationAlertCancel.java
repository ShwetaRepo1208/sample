package com.shweta.alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmationAlertCancel {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		Alert a = driver.switchTo().alert();
		
		a.dismiss();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
