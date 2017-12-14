package Utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasicConfigurations.BasicConfig;
import Tests.Mpin.MpinTest;
import io.appium.java_client.android.AndroidKeyCode;

public class BasicOperations extends BasicConfig{
	
	public void login() throws IOException, InterruptedException{	
		driver.findElement(By.id("com.engage.patient.debug:id/rb_email")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.FrameLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")).sendKeys("vrajput@mphrx.com");
		driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.RelativeLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Test@123");
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_TAB);
		//driver.hideKeyboard();
		driver.findElement(By.id("com.engage.patient.debug:id/btn_proceed")).click();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   // grantPermission("android:id/button1", "ID");
	   // grantPermission("com.android.packageinstaller:id/permission_allow_button", "ID");
	   // grantPermission("com.android.packageinstaller:id/permission_allow_button", "ID");
	}
	
	public void grantPermission(String el, String a){
	  switch(a){
	    case "ID":
		  if(driver.findElements(By.id(el)).size()!= 0){
			  driver.findElement(By.id(el)).click();
		  }
		  break;
	    case "class":
		  if(driver.findElements(By.id(el)).size()!= 0){
		      driver.findElement(By.className(el)).click();
		  }
		  break;
	    case "xpath":
	      if(driver.findElements(By.id(el)).size()!= 0){
			  driver.findElement(By.xpath(el)).click();
		  }
		  break;	
		}
	}
	
	public void signOut(){
		driver.findElement(By.xpath("//android.widget.ImageButton[contains(@content-desc,'Drawer_Opened')]")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='5']/android.widget.TextView[@index='1']")).click();
		driver.findElement(By.id("com.engage.patient.debug:id/continue_action")).click();
	}


}
