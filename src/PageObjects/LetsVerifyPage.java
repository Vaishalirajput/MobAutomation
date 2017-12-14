package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetsVerifyPage{

	public final WebDriver driver;
	public LetsVerifyPage(WebDriver d){
		driver = d;
	}
	
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
}
