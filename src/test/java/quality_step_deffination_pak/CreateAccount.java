package quality_step_deffination_pak;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import quality_page_actions_pak.Quality_CreateAccountpageActions;
import quality_page_actions_pak.Quality_HomepageActions;
import quality_page_actions_pak.Quality_SigninPageActions;
import quality_page_actions_pak.Quality_VerifyPageActions;
import quality_utility_pak.Quality_Base;

public class CreateAccount extends Quality_Base{
	
	Quality_HomepageActions quality_homepageactions = new Quality_HomepageActions();
	
	Quality_CreateAccountpageActions quality_createaccountpageactions = new Quality_CreateAccountpageActions();
	
	Quality_SigninPageActions quality_signinpageactions = new Quality_SigninPageActions();
	
	Quality_VerifyPageActions quality_verifypageactions = new Quality_VerifyPageActions();

	

@Given("^Open <\"([^\"]*)\"> application$")
public void open_application(String URL) throws Throwable {
	
	lunchingapp(URL);
    
}

@Then("^Click Mousehover Signinlink$")
public void click_Mousehover_Signinlink() throws Throwable {
	
	quality_homepageactions.ClickMousehoverSigninlink();
   
}

@Then("^Click Start here$")
public void click_Start_here() throws Throwable {
	
	quality_homepageactions.ClickStarthere();
    
}

@Then("^Enter FirstName LastName$")
public void enter_FirstName_LastName() throws Throwable {
	
	quality_createaccountpageactions.EnterFirstNameLastName();
    }

@Then("^Enter Email$")
public void enter_Email() throws Throwable {
	
	quality_createaccountpageactions.EnterEmail();
  
}

@Then("^Enter Password and Re-enter password$")
public void enter_Password_and_Re_enter_password() throws Throwable {
	
	quality_createaccountpageactions.EnterPasswordandReenterpassword();
    
}

@Then("^Click Continue$")
public void click_Continue() throws Throwable {
	
	quality_createaccountpageactions.ClickContinue();
   
}

@Then("^Click Signinlink$")
public void click_Signinlink() throws Throwable {
	
	
	quality_homepageactions.ClickSigninlink();
    
}

@Then("^Enter email(\\d+)$")
public void enter_email(int arg1) throws Throwable {
	
	quality_signinpageactions.Enteremail2();
    
}

@Then("^Click continue(\\d+)$")
public void click_continue(int arg1) throws Throwable {
	
	quality_signinpageactions.Clickcontinue2();
   
}

@Then("^Enter password$")
public void enter_password() throws Throwable {
	
	quality_signinpageactions.Enterpassword();
	
	}

@Then("^Click Signin button$")
public void click_Signin_button() throws Throwable {
	
	quality_signinpageactions.ClickSigninbutton();
    
}

@Then("^Verify user can Signin successfully$")
public void verify_user_can_Signin_successfully() throws Throwable {
	
	quality_verifypageactions.VerifyusercanSigninsuccessfully();
   
}





}
