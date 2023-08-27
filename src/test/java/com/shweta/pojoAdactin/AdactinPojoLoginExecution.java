package com.shweta.pojoAdactin;


import com.shweta.base.AdactinBase;

public class AdactinPojoLoginExecution extends AdactinBase{

	public static void main(String[] args) {
		
		browserLaunch_login("https://adactinhotelapp.com/index.php/");
		
		AdactinLoginPojo pojo = new AdactinLoginPojo();
		
		pojo.getUsername().sendKeys("abinesh12345");
		pojo.getPassword().sendKeys("12345");
		pojo.getLogin().click();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
