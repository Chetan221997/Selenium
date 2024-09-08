package TestNg;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Assert;
@Test
public class SoftAssertEx1 {

	public void SoftAssert()
	{
		SoftAssertEx1 asser = new SoftAssertEx1();
		System.out.println("Step1");
		System.out.println("Step2");
		org.testng.asserts.SoftAssert soft = new SoftAssert();
		soft.assertEquals(false,true);
		Assert.assertEquals(false, false);
		System.out.println("Step3");
		System.out.println("Step4");
		soft.assertAll();
		
		
		
		
	}
	
	
}
