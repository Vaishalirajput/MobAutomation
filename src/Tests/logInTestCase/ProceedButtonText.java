package Tests.logInTestCase;

import java.io.IOException;

import org.testng.annotations.Test;

public class ProceedButtonText extends LaunchAppForLogin{

	public ProceedButtonText() throws IOException, InterruptedException {
		super();
	}
	
	@Test
	public void loginUIProceedButtonText()
	{	
		
		sAssert.assertEquals( page.proceedButtonText.getText(), "Proceed");
	}

}
