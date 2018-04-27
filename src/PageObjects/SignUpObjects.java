package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpObjects {

	public final WebDriver driver;
	public SignUpObjects(WebDriver d){
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
	
	
	
	// Sign Up Screen
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement backArrow;
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement headerTextSignUp;
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement screenText;
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement mobileNumberPlaceHolderText;
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement radioButtonDefaultValue;
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement proceedText;
	
	// Let's verify screen
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement backArrowOTPscreen;
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement headerTextOTPScreen;
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement descriptiveTextOTPScreen;
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement autoVerificationBeforeFailedText;
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement autoVerificationAfterFailedText;
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement phoneNoOTPScreen;
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement resendOTPButton;
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement proceedButtonOTPscreen;
	
	@FindBy(id="com.fisike:id/tv_navigation_drawer_item_title")
	private WebElement editIcon;
	
	// Your Password Screen
	
	
	
	
}
