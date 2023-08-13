package quality_page_locator_pak;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import quality_utility_pak.Quality_Base;

public class Quality_SigninPageLocator extends Quality_Base {
	
	public Quality_SigninPageLocator() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ap_email")
	public WebElement qualityemail2;
	
	
	@FindBy(id = "continue")
	public WebElement qualitycontinue2;
	
	
	@FindBy(id = "ap_password")
	public WebElement qualitypassword;
	
	
	@FindBy(id = "signInSubmit")
	public WebElement qualitysigninbutton;
	
	
	
}
