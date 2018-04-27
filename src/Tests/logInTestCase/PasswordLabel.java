package Tests.logInTestCase;

import java.io.IOException;

import org.testng.annotations.Test;

public class PasswordLabel  extends LaunchAppForLogin {

	public PasswordLabel() throws IOException, InterruptedException {
		super();
	}
		
	@Test
	public void loginUIPasswordLabelText()
	{
		sAssert.assertEquals( page.passwordLabel.getText(), "Password");
	}
}
