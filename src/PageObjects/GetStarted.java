package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetStarted {
	
	public final WebDriver driver;
	public GetStarted(WebDriver d){
		driver = d;
	} 

	//launch screen
		@FindBy(id="com.mphrx.engage.patient.debug:id/btn_skip")
		private WebElement skipButton;
		
		//Let's Get Started screen
		
		@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
		private WebElement headerText;
		
		@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
		private WebElement usernameRadioButtonText;
		
		@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
		private WebElement emailRadioButtonText;
		
		@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
		private WebElement mobileNoRadioButtonText;
		
		@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
		private WebElement mobileNoPlaceholderText;
		
		@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
		private WebElement countryCodePlaceholderValue;
		
		@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
		private WebElement passwordPlaceholderText;
		
		@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
		private WebElement eyeIcon;
		
		@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
		private WebElement forgotPasswordLabel;
		
		@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
		private WebElement signUpLabel;
		
		@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
		private WebElement proceedLabel;
		
		@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
		private WebElement emailPlaceholder;
		
		@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
		private WebElement usernamePlaceholder;
}
