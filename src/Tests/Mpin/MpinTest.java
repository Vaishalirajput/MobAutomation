package Tests.Mpin;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasicConfigurations.BasicConfig;
import PageObjects.MpinObjects;
import PageObjects.SignUpObjects;
import Utilities.BasicOperations;

public class MpinTest extends BasicConfig{
	BasicConfig launchapp;
	static BasicOperations basicOp;
	SoftAssert sAssert;
	MpinObjects page;
	public MpinTest() throws IOException, InterruptedException
	{
		//launchapp = new BasicConfig();
		//driver = launchapp.launchApp();
		basicOp = new BasicOperations();
		//basicOp.driver = driver;
		//page = PageFactory.initElements(driver, MpinObjects.class);
		sAssert = new SoftAssert();
		
	}
	@AfterMethod
	public void logOut(){
		basicOp.signOut();
		
	}
	
	@BeforeMethod
	//public void logintoApp() throws IOException, InterruptedException{
	public static void main(String[] args) throws IOException, InterruptedException{
		MpinTest test = new MpinTest();
		basicOp.login();
	}
	
	@Test
	public void testMpinDialogonLogin(){
		
		//sAssert.assertEquals(page.confirmationBox.), 1);
	    sAssert.assertEquals(page.confirmationBoxHeader.getText(), "Add mPIN");
		sAssert.assertEquals(page.confirmationBoxBody.getText(), "Please set your mPIN from Settings for security purpose.");
		sAssert.assertEquals(page.confirmationContinueButton.getText(), "OK, Got it.");
		page.confirmationContinueButton.click();
		//sAssert.assertEquals(page.confirmationBox.size()>1, true);
	}
	
	
	
	
	
		
}
