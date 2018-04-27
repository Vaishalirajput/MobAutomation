package Tests.logInTestCase;

import java.io.IOException;

import org.testng.annotations.Test;

public class UsernameRadioButton extends LaunchAppForLogin{

	public UsernameRadioButton() throws IOException, InterruptedException {
		super();
	}
		
	@Test
	public void loginUIUsernameRadioButton()
	{
		sAssert.assertEquals( page.usernameRadioButton.getText(), "Username");
	}
}
