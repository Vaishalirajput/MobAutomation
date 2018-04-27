package Utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasicConfigurations.BasicConfig;
import PageObjects.MpinObjects;
import PageObjects.SignUpObjects;
import Tests.Mpin.MpinTest;
import io.appium.java_client.android.AndroidKeyCode;

public class BasicOperations extends BasicConfig{
	BasicConfig launchapp;
	SoftAssert sAssert;
	
	public BasicOperations() throws IOException, InterruptedException
	{
		launchapp = new BasicConfig();
		driver = launchapp.launchApp();
		sAssert = new SoftAssert();
		
	}
	
	public void login() {}

	
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
