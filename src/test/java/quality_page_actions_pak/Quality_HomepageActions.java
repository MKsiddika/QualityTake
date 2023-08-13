package quality_page_actions_pak;

import org.openqa.selenium.interactions.Actions;

import quality_page_locator_pak.Quality_HomepageLocator;
import quality_utility_pak.Quality_Base;

public class Quality_HomepageActions extends Quality_Base {
	
	Quality_HomepageLocator quality_homepagelocator = new Quality_HomepageLocator();
	
	public void ClickMousehoverSigninlink() {
		
		Actions mousehover = new Actions(driver);
		mousehover.moveToElement( quality_homepagelocator.qualitymousehoversingninlink).build().perform();

		
	}
	
    public void ClickStarthere () {
    	
    	 quality_homepagelocator.qualitystarthere.click();
		
	}
    
     public void ClickSigninlink() {
    	 
    	 quality_homepagelocator.qualitysigninlink.click();
    	 
    	 
		
     }

}
