package TestNg;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void CreatContact()
	{
	//	. (if dependent method fails, the module which are depending will be skiped)
		System.out.println("contact created");
	}
	@Test(dependsOnMethods = "CreatContact")
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
