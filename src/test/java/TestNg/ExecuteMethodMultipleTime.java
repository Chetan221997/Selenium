package TestNg;

import org.testng.annotations.Test;

public class ExecuteMethodMultipleTime {

	@Test(invocationCount = 3)
	public void CreatContact()
	{
		
		System.out.println("contact created");
	}
	@Test
	public void ModifyContact()
	{
		
		System.out.println("contact modified");
	}
@Test
	public void DeleteContact()
	{
		
		System.out.println("contact deleted");
	}
	
	
}
