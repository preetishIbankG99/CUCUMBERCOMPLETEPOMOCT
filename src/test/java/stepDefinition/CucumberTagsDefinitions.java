package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class CucumberTagsDefinitions {
	public static WebDriver driver;
	@Given("^This is valid logintest$")
	public void this_is_valid_logintest()  {
		System.setProperty("webdriver.chrome.driver", "E:\\OXYGENWORKSPACE\\CucumberTest\\Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	       driver.findElement(By.id("btnLogin")).click();
	       driver.close();
	}

	@Given("^This is invalid logintest$")
	public void this_is_invalid_logintest()  {
		System.setProperty("webdriver.chrome.driver", "E:\\OXYGENWORKSPACE\\CucumberTest\\Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		   driver.findElement(By.id("txtUsername")).sendKeys("Admin123");
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	       driver.findElement(By.id("btnLogin")).click();
	       driver.close();
	}

	@Given("^This is new usertestcase$")
	public void this_is_new_usertestcase() {
	
	}

	@Given("^This is new dealtestcase$")
	public void this_is_new_dealtestcase() {
	   
	}

	@Given("^This is new taskrtestcase$")
	public void this_is_new_taskrtestcase()  {
	  
	}
}
