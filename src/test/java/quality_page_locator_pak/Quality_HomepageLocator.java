package quality_page_locator_pak;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import quality_utility_pak.Quality_Base;

public class Quality_HomepageLocator extends Quality_Base{
	
	public Quality_HomepageLocator() {
		
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id = "nav-link-accountList")
	public WebElement qualitymousehoversingninlink;
	
	@FindBy(linkText = "Start here.")
	public WebElement qualitystarthere;
	
    @FindBy(xpath = "//span[text()='Sign in']")
	public WebElement qualitysigninlink;


}
