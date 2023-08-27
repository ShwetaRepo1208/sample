import org.testng.annotations.Test;
public class Sample_FileNG 
{
	@Test(groups="smoke")
		public void tc1()
	{
		System.out.println("TC1");
	}
	
	@Test(groups="sanity")
	public void tc2()
	{
			System.out.println("TC2");
	}
	
	@Test(groups="Regression")
	public void tc3()
		{
			System.out.println("TC3");
		}
	}



