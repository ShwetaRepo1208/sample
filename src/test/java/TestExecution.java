import org.openqa.selenium.By;
 import org.openqa.selenium.WebElement;

import com.shweta.base.Base;

public class TestExecution extends Base {
	
	public static void main(String[] args) {
		browserlaunch("https://www.facebook.com/");
		printURL();
		printTitle();
		WebElement user = driver.findElement(By.id("email"));
		sendValue(user, "Besant Tech");
		
		WebElement password = driver.findElement(By.id("pass"));
		sendValue(password, "pass_1234");
		
		quitBrowser();
	}
}
