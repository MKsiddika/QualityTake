package quality_page_locator_pak;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import quality_utility_pak.Quality_Base;

public class Quality_VerifyPageLocator extends Quality_Base{
	
	public Quality_VerifyPageLocator() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "nav-link-accountList-nav-line-1")
	public WebElement qualityverifyprofile;

}
