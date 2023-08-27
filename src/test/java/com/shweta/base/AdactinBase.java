package com.shweta.base;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinBase{

	public static WebDriver driver;
	public static WebElement ele;
		
		public static void browserLaunch_login(String url){
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url); 
			driver.manage().window().maximize();
		}
		
		public static void browserLaunch(String url){
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url); 
			driver.manage().window().maximize();
		}
		
		public static void sendValue(WebElement ref, String value) {
			ref.sendKeys(value);
		}
		
		public static void sendValue_login(WebElement ref, String value) 
		{
			ref.sendKeys(value);
		
		}
		public static void quitBrowser() {
			driver.quit();
		}

		
		public static void select_dropdowns()
		{
			WebElement loc =driver.findElement(By.id("location"));
			Select s= new Select(loc);
			s.selectByValue("Sydney");
			
			WebElement hotel =driver.findElement(By.id("hotels"));
			Select s1= new Select(hotel);
			s1.selectByValue("Hotel Creek");
			
			WebElement rt =driver.findElement(By.id("room_type"));
			Select s2= new Select(rt);
			s2.selectByValue("Standard");

			WebElement room_nos =driver.findElement(By.id("room_nos"));
			Select s3= new Select(room_nos);
			s3.selectByValue("1");
			
			WebElement adult_room =driver.findElement(By.id("adult_room"));
			Select s4= new Select(adult_room);
			s4.selectByValue("1");
			
			
		}
		
		public static void booking_details()
		{
			WebElement first_name =driver.findElement(By.id("first_name"));
			first_name.sendKeys("shweta");
			
			WebElement last_name =driver.findElement(By.id("last_name"));
			last_name.sendKeys("kumari");
			
			WebElement address =driver.findElement(By.id("address"));
			address.sendKeys("Bangalore-37");
			
			WebElement cc_num =driver.findElement(By.id("cc_num"));
			cc_num.sendKeys("1234567890000000");
			
						
			WebElement cc_type =driver.findElement(By.id("cc_type"));
			Select s2= new Select(cc_type);
			s2.selectByValue("VISA");
			
			WebElement cc_exp_month =driver.findElement(By.id("cc_exp_month"));
			Select s3= new Select(cc_exp_month);
			s3.selectByValue("10");
			
			
			WebElement cc_exp_year =driver.findElement(By.id("cc_exp_year"));
			Select year= new Select(cc_exp_year);
			year.selectByValue("2026");
			
			WebElement cc_cvv =driver.findElement(By.id("cc_cvv"));
			cc_cvv.sendKeys("678");
	
		}
	
	}


