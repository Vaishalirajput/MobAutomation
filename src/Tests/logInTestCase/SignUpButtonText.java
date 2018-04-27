package Tests.logInTestCase;

import java.io.IOException;

import org.testng.annotations.Test;

public class SignUpButtonText extends LaunchAppForLogin{

	public SignUpButtonText() throws IOException, InterruptedException {
		super();
	}
	
	@Test
	public void loginUISignUpButtonText()
	{
		sAssert.assertEquals( page.signUpButtonText.getText(), "Sign Up");
	}
	

}
