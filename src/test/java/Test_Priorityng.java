import org.testng.annotations.Test;

public class Test_Priorityng {
	@Test()
	private void tc1()
	{
		System.out.println("tc1");
		
	}
	@Test(timeOut = 1000)
	private void tc2() throws InterruptedException	{
		Thread.sleep(20000);
		System.out.println("tc2");
		
	}
	@Test(dependsOnMethods = "tc2")
	private void tc3()	{
		System.out.println("tc3");
		
	}


}
