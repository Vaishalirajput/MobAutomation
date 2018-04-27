package Tests.logInTestCase;

import java.io.IOException;

import org.testng.annotations.Test;

public class EmailRadioButton  extends LaunchAppForLogin {


	public EmailRadioButton() throws IOException, InterruptedException {
		super();
	}
		
	@Test
	public void loginUIEmailRadioButton()
	{
		sAssert.assertEquals( page.emailRadioButton.getText(), "Email");
	}
}
