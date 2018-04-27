package Tests.logInTestCase;

import java.io.IOException;

import org.testng.annotations.Test;

public class MobileRadioButton  extends LaunchAppForLogin{
	
	public MobileRadioButton() throws IOException, InterruptedException {
		super();
	}
		
	@Test
	public void loginUIMobileRadio()
	{
		sAssert.assertEquals( page.phoneRadioButton.getText(), "Mobile Number");
	}

}
