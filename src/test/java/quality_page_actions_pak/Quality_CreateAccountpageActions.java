package quality_page_actions_pak;

import quality_page_locator_pak.Quality_CreateAccountpageLocator;
import quality_test_data_pak.Quality_Test_Data;
import quality_utility_pak.Quality_Base;

public class Quality_CreateAccountpageActions extends Quality_Base {
	
	Quality_CreateAccountpageLocator quality_createaccountpagelocator = new Quality_CreateAccountpageLocator();
	
	public void EnterFirstNameLastName() {
		
		quality_createaccountpagelocator.qualityfirstlastname.sendKeys("Jonab Jay");
		
	}
	
    public void EnterEmail() {
    	
    	quality_createaccountpagelocator.qualityemail.sendKeys("jonab123@text.com");
		
	}

   public void  EnterPasswordandReenterpassword () {
	   
	   quality_createaccountpagelocator.qualitypassword.sendKeys(Quality_Test_Data.password10);
	   quality_createaccountpagelocator.qualityrepassword.sendKeys(Quality_Test_Data.password10);
	   
	
}

   public void ClickContinue() {
	   
	   quality_createaccountpagelocator.qualitycontinue.click();
	
}

}
