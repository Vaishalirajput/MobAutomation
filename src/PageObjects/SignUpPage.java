package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {
    public final WebDriver driver;
	public SignUpPage(WebDriver d){
		driver = d;
	}
	
	

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
}
