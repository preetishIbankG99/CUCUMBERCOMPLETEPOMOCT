package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSearchPage {
	
	@FindBy(xpath="//b[text()='Admin']")
	WebElement Admintab;
	
	@FindBy(id="searchSystemUser_userName")
	WebElement Usersearchbox;
	
	@FindBy(id="searchBtn")
	WebElement Searchbutton;
	
	
	
	
	public UserSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	public void  clickAdmintab() {
		Admintab.click();
	}
	
	public void searchUser(String usern) {
		Usersearchbox.sendKeys(usern);
	}
public void clickSearchbutton() {
	Searchbutton.click();
}

}
