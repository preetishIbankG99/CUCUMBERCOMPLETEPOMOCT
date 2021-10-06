package pageObjects;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class AdminLoginPage  {
	
public WebDriver  driver;

   @FindBy(id="txtUsername")
	@CacheLookup
	WebElement userText;
	
	
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement passwordText;

	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement clickBtn;
	
	public AdminLoginPage(WebDriver rdriver)throws IOException {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		}
		
		

		public void enteruserName(String userid) {
            userText.clear();
			userText.sendKeys(userid);
			
		}
		
		public void enteruserPassword(String passwrd) {
			passwordText.clear();
			passwordText.sendKeys(passwrd);
		}

	   public void clickButton() {
		clickBtn.click();
	    }








}
