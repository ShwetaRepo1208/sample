package com.shweta.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinNGExecution extends AdactinBase{
	@Test
	public void tc1_login() throws InterruptedException
	{
		browserLaunch_login("https://adactinhotelapp.com/index.php/");
		WebElement user = driver.findElement(By.id("username"));
		sendValue_login(user, "abinesh12345");
		
		WebElement pwd = driver.findElement(By.id("password"));
		sendValue_login(pwd,"12345");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		
		System.out.println(driver.getTitle());
		        
		driver.navigate().to("https://adactinhotelapp.com/SearchHotel.php/");
		
		WebElement textPrint = driver.findElement(By.xpath("//span[text()='(Fields marked with Red asterix (*) are mandatory)']"));
		System.out.println(textPrint.getText());
		
		select_dropdowns();
		
		WebElement searchBtn = driver.findElement(By.name("Submit"));
		searchBtn.click();
		
	
		driver.navigate().to("https://adactinhotelapp.com/SelectHotel.php");
	
		WebElement radioBtn = driver.findElement(By.id("radiobutton_2"));
		radioBtn.click();
		System.out.println(radioBtn.isSelected());	
		Thread.sleep(2000);
					
		WebElement continueBtn = driver.findElement(By.name("continue"));
		continueBtn.click();
		
		driver.navigate().to("https://adactinhotelapp.com/BookHotel.php");

		booking_details();
		
		WebElement bookBtn = driver.findElement(By.name("book_now"));
		bookBtn.click();
		

		WebElement orderno = driver.findElement(By.name("order_no"));
		System.out.println("Orderno = " + orderno.getAttribute("value"));	
		
		driver.quit();
			
	}

	
	
}

