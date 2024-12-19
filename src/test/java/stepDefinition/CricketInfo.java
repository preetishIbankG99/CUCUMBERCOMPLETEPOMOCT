package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CricketInfo {

    private static final Logger log = Logger.getLogger(CricketInfo.class);
    public static WebDriver driver;


        @Given("I launch web application")
        public void i_launch_web_application() throws IOException {
            //Creating a map to store preferences
            Map<String,Object> prefs = new HashMap<String, Object>();
            //adding key and value to map as follow to switch off browser notification
            //pass the argument 1 to allow and 2 to block
            prefs.put("profile.default_content_settings.popups",2);
            //Create an instance  of ChromeOptions
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs",prefs);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            Properties props=new Properties();
            props.load(new FileInputStream(("log4j.properties")));
            PropertyConfigurator.configure(props);
            log.info("###Browser Launched###");


        }
        @When("I Entered Url")
        public void i_entered_url() throws FileNotFoundException {
            FileReader reader=new FileReader("C:\\Users\\Preetish\\CUCUMBERCOMPLETEPOM\\config\\object.properties");
            Properties prop = new Properties();
            try{
                prop.load(reader);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            driver.navigate().to(prop.getProperty("url"));
            log.info("###Url Entered###");
            driver.manage().timeouts().implicitlyWait(2000L, TimeUnit.SECONDS);
            WebElement poup= driver.findElement(By.xpath("//div[text()='Latest cricket updates']"));
            if(poup.isDisplayed()){
                driver.findElement(By.xpath("//button[text()=\"Yes! I'm in\"]")).click();

          }

        }
        @Then("I should be able to capture cricket score update")
        public void i_should_be_able_to_capture_cricket_score_update() {
            driver.findElement(By.xpath("//a[text()='Live Scores']")).click();
            log.info("###Clicked on Live score link###");
            List<WebElement> matchinfo= driver.findElements(By.xpath("//div[@class='ds-px-4 ds-py-3']"));
            for(int i=1;i<matchinfo.size();i++) {
                log.info("Match: "+i+"");
                log.info(matchinfo.get(i).getText());

            }


    }
    @Then("I close browser")
    public void i_close_browser() {
       driver.close();
        log.info("$$$Browser Closed$$$");
    }
}



