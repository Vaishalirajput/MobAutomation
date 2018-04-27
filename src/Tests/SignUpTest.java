package Tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import BasicConfigurations.BasicConfig;

import PageObjects.SignUpObjects;

public class SignUpTest extends BasicConfig{

    SoftAssert sAssert;
	SignUpObjects page;
	BasicConfig launchapp;
	public SignUpTest() throws IOException, InterruptedException
	{
		//launchapp = new BasicConfig();
		//driver = launchapp.launchApp();
		//page = PageFactory.initElements(driver, LoginObjects.class);
		//sAssert = new SoftAssert();
	    launchapp = new BasicConfig();
	    launchapp.launchApp();
		page = PageFactory.initElements(driver, SignUpObjects.class);
		sAssert = new SoftAssert();
		
	}
	
	/*@Test
	public void login() throws IOException, InterruptedException{	
	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
	    Thread.sleep(10000);
		page.emailRadio.click();
		page.emailInput.sendKeys("rent@mphrx.com");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		page.passwordInput.sendKeys("Test@123");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		page.proceedButton.click();
	}*/
	
	@Test
	public void verifyEleOnLetsVerifyScreen(){
		
	}
	
}
