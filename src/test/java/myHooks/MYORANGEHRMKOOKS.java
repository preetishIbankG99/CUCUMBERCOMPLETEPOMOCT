package myHooks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MYORANGEHRMKOOKS {
	public static WebDriver driver;
@Before(order=1)
public void setUP(Scenario sc) {
	
	System.out.println("#########LAUNCH ORANGE HRM APP##########");
	System.out.println(sc.getName());
}
@Before(order=2)
public void launchURL() {
	
	System.out.println("^^^^^^^^^^^^^^^^LAUNCH URL FOR APP^^^^^^^^^^^^");
}

@After(order=2)
public void loggedOut() {
	System.out.println("@@@@@@@@@@@@LOGGED OUT APP@@@@@@@@@@@@@@@");
	
}
@After(order=1)
public void tearDOWN(Scenario sc) throws IOException {
	System.out.println("$$$$$$$$$$$$$CLOSE APP$$$$$$$$$$$$$$$$$");
	System.out.println(sc.getName());
	
}


}