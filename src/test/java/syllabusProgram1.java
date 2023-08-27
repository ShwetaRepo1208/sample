import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class syllabusProgram1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Browser Launch
		driver.get("https://adactinhotelapp.com/Register.php"); 
		//Web driver Methods
		//WebDriver method-get()
		driver.manage().window().maximize();   //WebDriver method-manage()
		String title =driver.getTitle();       //WebDriver method-getTitle()
		System.out.println(title);
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int size= alllinks.size();
		System.out.println("Number of links = " + size);
		
		Thread.sleep(2000);
		
		//using xpath-index
		WebElement userName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		userName.sendKeys("ShwetaUser");
		
		WebElement pwd = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		pwd.sendKeys("Shweta1234");
		
		WebElement cnfPwd = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		cnfPwd.sendKeys("Shweta1234");
		
		WebElement fName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		fName.sendKeys("Shweta User");
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		email.sendKeys("shweta4567@gmail.com");
	    
		
		WebElement textPrint = driver.findElement(By.xpath("//span[text()='(Fields marked with Red asterix (*) are mandatory)']"));
		System.out.println(textPrint.getText());

		Thread.sleep(3000);
						
		Actions adac = new Actions(driver);
		WebElement rtclick = driver.findElement(By.linkText("Go back to Login page"));
		adac.moveToElement(rtclick).perform();
		adac.contextClick().perform();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://demoqa.com/droppable");      
		String urlString=driver.getCurrentUrl();
		System.out.println(urlString);
		driver.navigate().back();

		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement dragEle = driver.findElement(By.xpath("//*[text()='Drag me']"));
		WebElement dropEle = driver.findElement(By.xpath(("//*[text()='Drop here']")));
		Actions a =new Actions(driver);
		a.dragAndDrop(dragEle, dropEle).perform();
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
	

}
