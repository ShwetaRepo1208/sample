package com.shweta.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver = null;
	
	public static void browserlaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();
		
	}
	
	public static void printURL() {
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void printTitle() {
		System.out.println(driver.getTitle());
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static void sendValue(WebElement ref, String value) {
		ref.sendKeys(value);
	}
}
