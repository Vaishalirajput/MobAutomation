package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class MpinObjects {

	public final WebDriver driver;
	public MpinObjects(WebDriver d){
		driver = d;
	}
	
	//confirmation box after Login for mpin
   @FindBy(className="android.widget.FrameLayout")
	public WebElement confirmationBox; 
		
	@FindBy(id="com.engage.patient.debug:id/header")
	public WebElement confirmationBoxHeader;
	
	@FindBy(id="com.engage.patient.debug:id/message_text")
	public WebElement confirmationBoxBody;
	
	@FindBy(id="com.engage.patient.debug:id/continue_action")
	public WebElement confirmationContinueButton;
	
	
	
	
}
