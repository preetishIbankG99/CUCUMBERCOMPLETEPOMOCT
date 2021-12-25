package stepDefinition;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AdminExcelPage;
import utilities.ExcelReader;
import utilities.TestUtil;
import utilities.WebEventListener;

public class ExcelStepDefinition extends TestBase{
	public ExcelStepDefinition() throws FileNotFoundException, IOException {
		super();
		
	}

	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static String browserName;
	public static AdminExcelPage ae;
	public static  ExcelReader reader;
	
	@Given("^user navigates to OrangeHRM page$")
	public void user_navigates_to_OrangeHRM_page() throws Throwable {
		 TestBase.initialization();
		  System.out.println("######BrowserOpened#######");
			 
	
	}

	@When("^user fills the form from given sheetname \"([^\"]*)\" and rownumber (\\d+)$")
//	@When("user fills the form from given sheetname {string}  and rownumber {int}")
	public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws Throwable {
	   ae=new AdminExcelPage(TestBase.driver);
	    reader = new ExcelReader();
		List<Map<String,String>> testData=
				reader.getData("E://Eclipse All versions//Workspace//CucumberTest//src//test//java//testData//TestData.xlsx", sheetName);
		String username = testData.get(rowNumber).get("username");
		String password = testData.get(rowNumber).get("password");
		ae.fillLoginCredentials(username, password);


	}

	@When("^user clicks on loggedin button$")
	public void user_clicks_on_loggedin_button() throws Throwable {
	  ae.clickButton();
	}

	@Then("^Title of WebPage is ORANGEHRM \\.$")
	public void title_of_WebPage_is_ORANGEHRM() throws Throwable {
	 System.out.println("Congrats Title Matched");
	}
}
