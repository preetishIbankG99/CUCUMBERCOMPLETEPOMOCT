package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utilities.TestUtil;
import utilities.WebEventListener;


public class TestBase {
	public static Properties prop;
	public static Logger logger;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static String browserName;
    

	public static WebDriver driver;
public TestBase()throws FileNotFoundException,IOException{
	    logger=Logger.getLogger("CucumberTest");
	    PropertyConfigurator.configure("log4j.properties");
	   
	        prop=new Properties();
	    File f=new File("E:\\Eclipse All versions\\Workspace\\CucumberTest\\config\\object.properties");
	    
	        FileInputStream fis=new FileInputStream(f);
	       
	    prop.load(fis);
	}
	public static  void initialization()throws IOException{
	    browserName = prop.getProperty("browser");
	    
	    if (browserName.equalsIgnoreCase("firefox")) {
	    	System.setProperty("webdriver.gecko.driver","E:\\Eclipse All versions\\Workspace\\CucumberTest\\Drivers\\geckodriver.exe");
	    	
	        driver = new FirefoxDriver();
	        logger.info("Firefox::Browser::Opened");



	    } else if (browserName.equalsIgnoreCase("chrome")) {
	    	System.setProperty("webdriver.chrome.driver", "E:\\Eclipse All versions\\Workspace\\CucumberTest\\Drivers\\chromedriver.exe");
	  	//System.setProperty("webdriver.chrome.driver", "../CucumberTest/Drivers/chromedriver.exe");
	        driver = new ChromeDriver();
	        logger.info("Chrome::Browser::Opened");

	    } else if (browserName.equalsIgnoreCase("ie")) {
	        System.setProperty("webdriver.ie.driver", "E:\\Eclipse All versions\\Workspace\\CucumberTest\\Drivers\\IEDriverServer.exe");
	        driver = new InternetExplorerDriver();
	        logger.info("ie::Browser::Opened");

	    }
	    e_driver=new EventFiringWebDriver(driver);
	    eventListener=new WebEventListener();
	    e_driver.register(eventListener);
	    driver=e_driver;
	     driver.manage().window().maximize();
	     logger.info("Browser::Maximized");
	     driver.get(prop.getProperty("url"));
	     logger.info("url entered");
	   
	     driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	}
	public  void takeScreenshot(WebDriver driver,String tname) throws IOException { 
		DateFormat df=new SimpleDateFormat("dd_MMM_YYYY hh_mm_ss");
		Date d =new Date();
		String Time=df.format(d);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(f, new File("..\\CucumberTest\\Screenshots\\" +System.currentTimeMillis() + tname +".png"+Time));
	   System.out.println("Screenshot Taken Successfully");//E:\Eclipse All versions\Workspace\CucumberTest
	}
	
	}
