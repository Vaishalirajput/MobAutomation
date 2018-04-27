package Tests.logInTestCase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObjects.SignInObjects;

public class VerifyLetsGetStartedText extends LaunchAppForLogin{

	public VerifyLetsGetStartedText() throws IOException, InterruptedException {
		super();
	}
		
	@Test
	public void loginUILetsGetStarted()
	{
		System.out.print("hello");
		sAssert.assertEquals( page.letsGetStartedText.getText(), "Let's Get Started!");
		
	}


}
