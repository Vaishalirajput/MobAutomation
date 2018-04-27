package Tests.logInTestCase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import BasicConfigurations.BasicConfig;
import PageObjects.SignInObjects;
import Utilities.BasicOperations;

public class LaunchAppForLogin extends BasicConfigurations.BasicConfig {
	
	static SignInObjects page;
	BasicOperations basicOp;
	BasicConfig launchApp = new BasicConfig();
	SoftAssert sAssert;
	public LaunchAppForLogin() throws IOException, InterruptedException{		
		sAssert = new SoftAssert();
	}
	
	@BeforeSuite
	public void launchAppforLogin() throws IOException, InterruptedException {
		driver = launchApp.launchApp();
		page = PageFactory.initElements(driver, SignInObjects.class);
		Thread.sleep(10000);
		
	}
	
	
	

}
