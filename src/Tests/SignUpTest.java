package Tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import BasicConfigurations.BasicConfig;
import PageObjects.SignUpObjects;
import io.appium.java_client.android.AndroidDriver;

public class SignUpTest extends BasicConfig{

    SoftAssert sAssert;
	SignUpObjects page;
	BasicConfig launchapp;
	public SignUpTest() throws MalformedURLException
	{
	    launchapp = new BasicConfig();
	   // launchapp.launchApp();
		page = PageFactory.initElements(driver, SignUpObjects.class);
		sAssert = new SoftAssert();
		
	}
	
	@Test
	public void verifyEleOnLetsVerifyScreen(){
		
	}
	
}
