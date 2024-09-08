package TestNg;

import org.testng.annotations.Test;

public class TestngPriority {
	
	@Test(priority=0)
	public void CreatContact()
	{
		
		System.out.println("contact created");
	}
	@Test(priority=2)
	public void ModifyContact()
	{
		
		System.out.println("contact modified");
	}
	
	
	//if we dont want to run this method we use "enabled"
@Test(enabled = false)
	public void DeleteContact()
	{
		
		System.out.println("contact deleted");
	}

}
