package Tests.logInTestCase;

import java.io.IOException;

import org.testng.annotations.Test;

public class ForgotPasswordLinkText  extends LaunchAppForLogin{

	public ForgotPasswordLinkText() throws IOException, InterruptedException {
		super();
	}
	
	@Test
	public void loginUIForgotPasswordLinkText()
	{
		sAssert.assertEquals( page.forgotPasswordText.getText(), "Forgot Password?");
	}
}
