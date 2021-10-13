package myHooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MYORANGEHRMKOOKS {
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
public void tearDOWN(Scenario sc) {
	System.out.println("$$$$$$$$$$$$$CLOSE APP$$$$$$$$$$$$$$$$$");
	System.out.println(sc.getName());
}


}