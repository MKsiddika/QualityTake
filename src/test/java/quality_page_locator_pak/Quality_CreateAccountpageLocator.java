package quality_page_locator_pak;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import quality_utility_pak.Quality_Base;

public class Quality_CreateAccountpageLocator extends Quality_Base {
	
	public  Quality_CreateAccountpageLocator() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ap_customer_name")
	public WebElement qualityfirstlastname;
	
	@FindBy(id = "ap_email")
	public WebElement qualityemail;
	
	@FindBy(id = "ap_password")
	public WebElement qualitypassword;
	
	@FindBy(id = "ap_password_check")
	public WebElement qualityrepassword;
	
	@FindBy(id = "continue")
	public WebElement qualitycontinue;

}


