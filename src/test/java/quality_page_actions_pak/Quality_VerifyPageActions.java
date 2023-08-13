package quality_page_actions_pak;

import org.testng.Assert;

import quality_page_locator_pak.Quality_VerifyPageLocator;
import quality_utility_pak.Quality_Base;
import quality_utility_pak.Quality_UtilityClass;

public class Quality_VerifyPageActions extends Quality_Base{
	
	Quality_VerifyPageLocator quality_verifypagelocator = new Quality_VerifyPageLocator();
	
	public void VerifyusercanSigninsuccessfully() throws Exception {
		
	boolean verify = quality_verifypagelocator .qualityverifyprofile.isDisplayed();
	Thread.sleep(4000);
	Assert.assertTrue(verify);
	
	 Quality_UtilityClass.takeMyScreenshot(driver,"profilepage");
	
	 }

}
