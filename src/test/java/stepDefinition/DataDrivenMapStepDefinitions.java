package stepDefinition;


import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestUtil;

public class DataDrivenMapStepDefinitions {
	public static WebDriver driver;
	
	@Given("^User is  on loginpage$")
	public void user_is_already_on_loginpage()  {
		System.setProperty("webdriver.chrome.driver", "E:\\OXYGENWORKSPACE\\CucumberTest\\Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		
	}

	@When("^Title is OrangeHRM$")
	public void title_is_OrangeHRM()  {
		String title=driver.getTitle();
		if(title.equals("OrangeHRM")) {
			System.out.println("Title Verified");
		}
	    
	}

	@Then("^User enters  valid username and valid password$")
	public void user_enters_valid_username_and_valid_password(DataTable mapcredentials) throws InterruptedException, IOException  {
	    for(Map<String,String>data1:mapcredentials.asMaps(String.class, String.class)) {
	    WebElement userfield=	driver.findElement(By.name("txtUsername"));
	        TestUtil.highLightElement(driver, userfield);
	    	userfield.sendKeys(data1.get("username"));
	    	Thread.sleep(4000);
	    	TestUtil.takeScreenshot(driver);
	    	System.out.println("::::::Username Screenshot Taken:::::::");
	    	
	    	WebElement passwdfield=driver.findElement(By.name("txtPassword"));
	    	TestUtil.highLightElement(driver, passwdfield);
	    	passwdfield.sendKeys(data1.get("password"));
	    	Thread.sleep(4000);
	    	TestUtil.takeScreenshot(driver);
	    	System.out.println("::::::Password Screenshot Taken:::::::");
	    	
	    	
	    	driver.findElement(By.name("txtUsername")).clear();
	    	
	    	driver.findElement(By.name("txtPassword")).clear();
	    }
	}

	@Then("^Closing browser$")
	public void tear_browser() throws IOException  {
		
	  driver.close();
	}
}
