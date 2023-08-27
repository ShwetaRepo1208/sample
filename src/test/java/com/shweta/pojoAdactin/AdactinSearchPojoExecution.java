package com.shweta.pojoAdactin;

import org.openqa.selenium.support.ui.Select;

import com.shweta.base.AdactinBase;

public class AdactinSearchPojoExecution extends AdactinBase {

	public static void main(String[] args) throws InterruptedException {
		
		
       browserLaunch_login("https://adactinhotelapp.com/index.php/");
		
		AdactinLoginPojo login = new AdactinLoginPojo();
		
		login.getUsername().sendKeys("abinesh12345");
		login.getPassword().sendKeys("12345");
		login.getLogin().click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://adactinhotelapp.com/SearchHotel.php/");
		
		AdactinPojosearch ref = new AdactinPojosearch();
				
		Select s= new Select(ref.getLocation());
		s.selectByValue("Sydney");
		
		Select s1= new Select(ref.getHotels());
		s1.selectByValue("Hotel Creek");
		
		Select s2= new Select(ref.getRoomType());
		s2.selectByValue("Standard");

		Select s3= new Select(ref.getNoOfrooms());
		s3.selectByValue("1");
		
		Select s4= new Select(ref.getAdultperroom());
		s4.selectByValue("1");
		
		System.out.println(ref.getTextPrint().getText());
		
		ref.getSearchBtn().click();
		
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		driver.navigate().to("https://adactinhotelapp.com/SelectHotel.php");
		
		 AdactinSearchDisplayPojo ref1 = new AdactinSearchDisplayPojo();
		 
		 ref1.getRadbtnselect().click();
		 
		 ref1.getBtnContinue().click();
		 
		 System.out.println(driver.getTitle());
		 Thread.sleep(2000);
		 
		 driver.quit();

	}

}
