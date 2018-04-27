package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInObjects {

	public final WebDriver driver;
	public SignInObjects(WebDriver d){
		driver = d;
	}
	
	//Lables
	@FindBy(id="com.engage.patient.debug:id/get_started")
	public WebElement letsGetStartedText; 
	
	@FindBy(id="com.engage.patient.debug:id/rb_username")
	public WebElement usernameRadioButton;
	
	@FindBy(id="com.engage.patient.debug:id/rb_email")
	public WebElement emailRadioButton;
	
	@FindBy(id="com.engage.patient.debug:id/rb_mobile")
	public WebElement phoneRadioButton;
	
	
	@FindBy(id="com.engage.patient.debug:id/et_username")
	public WebElement usernameLabel;
	
	@FindBy(id="com.engage.patient.debug:id/et_pass")
	public WebElement passwordLabel;
	
	@FindBy(id="com.engage.patient.debug:id/btn_forget_password")
	public WebElement forgotPasswordText;
	
	@FindBy(id="com.engage.patient.debug:id/btn_sign_up")
	public WebElement signUpButtonText;
	
	@FindBy(id="com.engage.patient.debug:id/btn_proceed")
	public WebElement proceedButtonText;
	
	//Input Fields and buttons
	 @FindBy(id="com.engage.patient.debug:id/btn_next")
		public WebElement nextButtonLanguageScreen; 
	 
	 @FindBy(id="com.engage.patient.debug:id/rb_email")
		public WebElement emailRadio;
	 
	 @FindBy(xpath="//android.widget.FrameLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		public WebElement emailInput;
	 
	 @FindBy(xpath="//android.widget.LinearLayout/android.widget.RelativeLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		public WebElement passwordInput;
	 
	 @FindBy(id="com.engage.patient.debug:id/btn_proceed")
	    public WebElement proceedButton;
		
}
