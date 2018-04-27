package Tests.logInTestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidKeyCode;

public class LoginUsingEmail extends LaunchAppForLogin{

	public LoginUsingEmail() throws IOException, InterruptedException {
		super();
	}
	
	@Test
	public void loginUsingEmail() throws InterruptedException
	{
		page.emailRadio.click();
		page.emailInput.sendKeys("rent@mphrx.com");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		page.passwordInput.sendKeys("Test@123");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		page.proceedButton.click();
		//basicOp.signOut();
	}

}
