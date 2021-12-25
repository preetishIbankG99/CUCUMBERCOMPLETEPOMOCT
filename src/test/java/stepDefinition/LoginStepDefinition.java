package stepDefinition;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestUtil;

public class LoginStepDefinition {
	public WebDriver driver;
	 
		
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
	 System.setProperty("webdriver.chrome.driver","E:\\OXYGENWORKSPACE\\CucumberTest\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	 }
	
	
	 @When("^title of login page is Orange HRM$")
	 public void title_of_login_page_is_Orange_HRM() throws Throwable {
	 String title = driver.getTitle();
	 System.out.println(title);
	 }
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password) throws IOException, InterruptedException
	 {
	
		 WebElement uid= driver.findElement(By.name("txtUsername"));
	TestUtil.highLightElement(driver, uid); 
	uid.sendKeys(username);
	
//	TestUtil.takeScreenshot(driver);
//	Thread.sleep(4000); 
	
	WebElement pwd=driver.findElement(By.name("txtPassword"));
	TestUtil.highLightElement(driver, pwd); 
	pwd.sendKeys(password);
	
//	 TestUtil.takeScreenshot(driver);
//	 Thread.sleep(3000);
	 }
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
		 driver.findElement(By.id("btnLogin")).click();
	 
	 }
	
	
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 }
	 
	 @Then("^Close the browser$")
	 public void close_the_browser() throws IOException{
		 driver.quit();
		
	 }
}
