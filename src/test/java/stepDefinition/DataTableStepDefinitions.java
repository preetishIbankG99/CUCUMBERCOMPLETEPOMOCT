package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataTableStepDefinitions {
	public static WebDriver driver;
	@Given("^User is already on loginpage$")
	public void user_is_already_on_loginpage()  {
		System.setProperty("webdriver.chrome.driver", "E:\\OXYGENWORKSPACE\\CucumberTest\\Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		List<List<String>>data=credentials.raw();
		driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get(0));
		   driver.findElement(By.id("txtPassword")).sendKeys(data.get(0).get(1));
	}

	@Then("^User clicks on loginbutton$")
	public void user_clicks_on_loginbutton()  {
	   driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^Close browser$")
	public void close_browser()  {
	    driver.close();
	}
}
