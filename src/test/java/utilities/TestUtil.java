package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import base.TestBase;

public class TestUtil {
public TestUtil() throws FileNotFoundException, IOException {
		//super();
		// TODO Auto-generated constructor stub
	}

public static WebDriver driver;
public static long PAGE_LOAD_TIMEOUT = 30;
public static long IMPLICIT_WAIT = 30;

//Screen shot utility
/*	public  static void takeScreenshot(WebDriver driver) throws IOException { 
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	    System.out.println("Screenshot Taken Successfully");
    FileUtils.copyFile(f, new File("..\\CucumberTest\\Screenshots\\" + System.currentTimeMillis() + ".png"));
	}*/
	
	//Element Highlighter
	 public static void highLightElement(WebDriver driver, WebElement element)
	    {
	        JavascriptExecutor js=(JavascriptExecutor)driver;

	        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	        try
	        {
	            Thread.sleep(500);
	        }
	        catch (InterruptedException e) {

	            System.out.println(e.getMessage());
	        }

	        js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	    }

	
	
	
	 
	
	}
