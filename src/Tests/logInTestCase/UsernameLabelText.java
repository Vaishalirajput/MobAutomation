package Tests.logInTestCase;

import java.io.IOException;

import org.testng.annotations.Test;

public class UsernameLabelText  extends LaunchAppForLogin  {

	public UsernameLabelText() throws IOException, InterruptedException {
		super();
	}
		
	@Test
	public void loginUIUsernameLabelText()
	{
		sAssert.assertEquals( page.usernameLabel.getText(), "Username");
	}
}
