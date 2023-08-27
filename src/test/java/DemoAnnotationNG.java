import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoAnnotationNG {

	@Test
	private void tc1()
	{
		System.out.println("tc1");
	}
	@BeforeClass
	private void beforeclass(){
		System.out.println("Before Class");
	}
	@AfterMethod
	private void aftermethod() {
		System.out.println("afterMethod");
	}
	@AfterClass
	private void afterClass()
	{
		System.out.println("after class");
	}
	@BeforeMethod
	private void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	
}
