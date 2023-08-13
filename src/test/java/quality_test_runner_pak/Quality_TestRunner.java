package quality_test_runner_pak;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import quality_utility_pak.Quality_Base;

@CucumberOptions(features = {"src/test/resources/Quality_Featurefile"},
plugin = {"json:target/cucumber.json"},
glue = "quality_step_deffination_pak" ,tags = {"@jon1"})



public class Quality_TestRunner extends AbstractTestNGCucumberTests{
	
    @BeforeTest
    
    public void openbrowser() {
    	
    	Quality_Base quality_base = new Quality_Base();
    	quality_base.quality_browser();	
    		
    	
    }
    
    @AfterTest
    
 public void closeapp() {
    	
    	Quality_Base quality_base = new Quality_Base();
    	quality_base.driver.quit();
    
    }  

}
