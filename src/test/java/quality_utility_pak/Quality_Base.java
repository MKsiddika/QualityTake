package quality_utility_pak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Quality_Base {
	
	public static WebDriver driver;
	public static Properties file ;
	
	
	public Quality_Base() {
		
	try {
		FileInputStream config_file = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\quality_configuration_pak\\quality_configuration.Properties");
		 file = new Properties();
		file.load(config_file);
	} catch (FileNotFoundException e) {
		System.out.println("This is a constructor setup");
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
	}
	
	public void quality_browser() {
		
	String broser =	file.getProperty("QualityBrowser1");
	
	if( broser.equalsIgnoreCase("Chrome")) {
		
		System.setProperty("Webdriver.chrome.driver",(System.getProperty("user.dir")+ "chrome_driver/chromedriver.exe"));
		ChromeOptions object = new ChromeOptions();
		object.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Quality_UtilityClass.pageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Quality_UtilityClass.implicitlyWait));
		driver.manage().window().maximize();
		
	}
	else if( broser.equalsIgnoreCase("EDge")) {
		
		System.setProperty("Webdriver.edge.driver",(System.getProperty("user.dir")+ "Edge_driver/msedgedriver.exe"));
		EdgeOptions object = new EdgeOptions();
		object.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Quality_UtilityClass.pageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Quality_UtilityClass.implicitlyWait));
		driver.manage().window().maximize();
		
		
		
	}
		
		
	}
	
	public static void lunchingapp(String URL) {
		
		driver.get(file.getProperty("QualityURL"));
	}
	
	
	 

}
