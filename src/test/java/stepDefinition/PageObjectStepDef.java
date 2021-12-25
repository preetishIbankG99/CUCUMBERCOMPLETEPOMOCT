package stepDefinition;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AdminLoginPage;
import utilities.WebEventListener;

public class PageObjectStepDef extends TestBase{
	public static Properties prop;
	public static Logger logger;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static String browserName;
	public static AdminLoginPage lp;
	
	
	public PageObjectStepDef() throws FileNotFoundException, IOException {
		super();
		
	}

	public static WebDriver driver;
	
	@Given("^Open chromebrowser and launch application$")
	public void open_chromebrowser_and_launch_application() throws IOException {
	    TestBase.initialization();
	   
		System.out.println("######BrowserOpened#######");
		
		
		}

	
	@When("^I enter correct \"([^\"]*)\" and correct \"([^\"]*)\"$")
	public void i_enter_correct_and_correct(String usern,String passd) throws IOException  {
		  lp=new AdminLoginPage(TestBase.driver);
		  
		lp.enteruserName(TestBase.prop.getProperty("uservalue"));
		lp.enteruserPassword(TestBase.prop.getProperty("passvalue"));
		
		 
		
		 
	}
	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		
	    lp.clickButton();
	    System.out.println("^^^^^^^^^^Credentials Passed^^^^^^^^^^");
	    
	}
	


	@Then("^Desired Page title OrangeHRM$")
	public void Desired_page_title() throws IOException {
	  System.out.println("Title is::: " +TestBase.driver.getTitle());
	   if(TestBase.driver.getTitle().equals("OrangeHRM")) {
		   Assert.assertTrue(true);
		   System.out.println("Application passed");
	   }
	    
	   else {
		   takeScreenshot(TestBase.driver,"logintest");
		   Assert.assertTrue(false);
		   System.out.println("Application Failed");
	   }
	}

	@Then("^Browser tear down$")
	public void Browser_tear_down()  {
	    TestBase.driver.close();
	    System.out.println("######Browser Closed######");
	}
}
