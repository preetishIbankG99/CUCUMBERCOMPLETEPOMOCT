 package pageObjects;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AdminExcelPage  {
	public static  WebDriver  driver;

	   @FindBy(id="txtUsername")
		@CacheLookup
		WebElement userText;
		
		
		@FindBy(id="txtPassword")
		@CacheLookup
		WebElement passwordText;

		
		@FindBy(id="btnLogin")
		@CacheLookup
		WebElement clickBtn;
		
		public AdminExcelPage(WebDriver rdriver)throws IOException {
			driver=rdriver;
			PageFactory.initElements(rdriver, this);
			}
		
		
		public void fillLoginCredentials(String userid,String passwrd) {
			userText.sendKeys(userid);
			passwordText.sendKeys(passwrd);
		}
		
		

		   public void clickButton() {
			clickBtn.click();
		    }



	





			


}
