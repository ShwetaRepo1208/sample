package com.shweta.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLoginRobot {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		try {
			Robot r = new Robot();
	        r.delay(1000); 
	        	       
	        r.keyPress(KeyEvent.VK_SHIFT);
	        r.keyPress(KeyEvent.VK_B);
	        r.keyRelease(KeyEvent.VK_B);
	        r.keyRelease(KeyEvent.VK_SHIFT);
	        
	        r.keyPress(KeyEvent.VK_E);
	        r.keyRelease(KeyEvent.VK_E);
	        r.keyPress(KeyEvent.VK_S);
	        r.keyRelease(KeyEvent.VK_S);
	        r.keyPress(KeyEvent.VK_A);
	        r.keyRelease(KeyEvent.VK_A);
	        r.keyPress(KeyEvent.VK_N);
	        r.keyRelease(KeyEvent.VK_N);
	        r.keyPress(KeyEvent.VK_T);
	        r.keyRelease(KeyEvent.VK_T);

       
	        r.keyPress(KeyEvent.VK_CONTROL);
	        r.keyPress(KeyEvent.VK_A);
	        r.keyRelease(KeyEvent.VK_A);
	        r.keyRelease(KeyEvent.VK_CONTROL);
	        r.keyPress(KeyEvent.VK_CONTROL);
	        r.keyPress(KeyEvent.VK_C);
	        r.keyRelease(KeyEvent.VK_C);
	        r.keyRelease(KeyEvent.VK_CONTROL);
	        
	        r.keyPress(KeyEvent.VK_TAB);
	        r.keyRelease(KeyEvent.VK_TAB);
	        
	        r.delay(1000);
	        r.keyPress(KeyEvent.VK_CONTROL);
	        r.keyPress(KeyEvent.VK_V);
	        r.keyRelease(KeyEvent.VK_V);
	        r.keyRelease(KeyEvent.VK_CONTROL);
	        
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
	        
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		driver.quit();
	
	}


}
