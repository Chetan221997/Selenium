
package TestNg;



import org.testng.Assert;
import org.testng.annotations.Test;



public class HardAssert {

	@Test
public void m1()
{
	System.out.println("Step1");
	System.out.println("Step2");
	Assert.assertEquals(false, false);
	System.out.println("Step3");
	System.out.println("Step4");
}
}
