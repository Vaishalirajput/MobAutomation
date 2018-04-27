package Tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasicConfigurations.BasicConfig;
import PageObjects.SignInObjects;
import PageObjects.SignUpObjects;
import Utilities.BasicOperations;
import io.appium.java_client.android.AndroidKeyCode;

public class LogInTest extends BasicConfigurations.BasicConfig{
	
	static BasicConfig launchApp =new BasicConfig();
	SignInObjects page;
	BasicOperations basicOp;
	SoftAssert sAssert;
	
	public LogInTest() throws IOException, InterruptedException {
		launchApp.launchApp();
		page = PageFactory.initElements(driver, SignInObjects.class);
		sAssert = new SoftAssert();
	}
	
	@Test
	public void loginUIProceedButtonText()
	{	
		
		sAssert.assertEquals( page.proceedButtonText.getText(), "Proceed");
	}
	
	@Test
	public void loginUILetsGetStarted()
	{
		sAssert.assertEquals( page.letsGetStartedText.getText(), "Let's Get Started!");
	}
	
	@Test
	public void loginUIUsernameRadioButton()
	{
		sAssert.assertEquals( page.usernameRadioButton.getText(), "Username");
	}
	
	@Test
	public void loginUIEmailRadioButton()
	{
		sAssert.assertEquals( page.emailRadioButton.getText(), "Email");
	}
	@Test
	public void loginUIMobileRadio()
	{
		sAssert.assertEquals( page.phoneRadioButton.getText(), "Mobile Number");
	}
	@Test
	public void loginUIUsernameLabelText()
	{
		sAssert.assertEquals( page.usernameLabel.getText(), "Username");
	}
	
	@Test
	public void loginUIForgotPasswordLinkText()
	{
		sAssert.assertEquals( page.forgotPasswordText.getText(), "Forgot Password?");
	}

	@Test
	public void loginUISignUpButtonText()
	{
		sAssert.assertEquals( page.signUpButtonText.getText(), "Sign Up");
	}

	@Test
	public void loginUIPasswordLabelText()
	{
		sAssert.assertEquals( page.passwordLabel.getText(), "Password");
	}
	
	
	@Test
	public void loginUsingEmail() throws InterruptedException
	{
		Thread.sleep(10000);
		page.emailRadio.click();
		page.emailInput.sendKeys("rent@mphrx.com");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		page.passwordInput.sendKeys("Test@123");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		page.proceedButton.click();
		basicOp.signOut();
	}
	
	
	
	
	
	

}
