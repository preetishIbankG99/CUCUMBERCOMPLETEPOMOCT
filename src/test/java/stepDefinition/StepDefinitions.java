package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	public static WebDriver driver;
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application(){
		System.setProperty("webdriver.chrome.driver", "E:\\OXYGENWORKSPACE\\CucumberTest\\Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String uname, String upass) {
	    
	driver.findElement(By.id("txtUsername")).sendKeys(uname);
	   driver.findElement(By.id("txtPassword")).sendKeys(upass);
	   }

	@Then("^Browser should be closed$")
	public void browser_should_be_closed() {
	   driver.close();
	}
}
