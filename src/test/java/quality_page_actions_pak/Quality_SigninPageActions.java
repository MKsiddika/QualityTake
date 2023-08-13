package quality_page_actions_pak;

import quality_page_locator_pak.Quality_SigninPageLocator;
import quality_test_data_pak.Quality_Test_Data;
import quality_utility_pak.Quality_Base;

public class Quality_SigninPageActions extends Quality_Base {
	
	Quality_SigninPageLocator quality_signinpagelocator = new Quality_SigninPageLocator();
	
	public void Enteremail2 () {
		
		quality_signinpagelocator.qualityemail2.sendKeys("");
		
	}
	
    public void Clickcontinue2() {
    	
    	quality_signinpagelocator.qualitycontinue2.click();
		
	}  

    public void Enterpassword() {
    	
    	quality_signinpagelocator.qualitypassword.sendKeys( Quality_Test_Data.password11);
	
}  

    public void ClickSigninbutton () {
    	
    	quality_signinpagelocator.qualitysigninbutton.click();
	
}
	
	
		
		
	

}
