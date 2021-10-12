$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Pageobject.feature");
formatter.feature({
  "line": 1,
  "name": "Checking HRM login feature",
  "description": "",
  "id": "checking-hrm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Test Login with valid credentials",
  "description": "",
  "id": "checking-hrm-login-feature;test-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Open chromebrowser and launch application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter correct \"username\" and correct \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Desired Page title OrangeHRM",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Browser tear down",
  "keyword": "Then "
});
formatter.match({
  "location": "PageObjectStepDef.open_chromebrowser_and_launch_application()"
});
formatter.result({
  "duration": 606369910275,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created\nfrom timeout: Timed out receiving message from renderer: 600.000\n  (Session info: chrome\u003d94.0.4606.81)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 6.1.7600 x86) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 604.17 seconds\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027GUDU-PC\u0027, ip: \u0027192.168.1.100\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:249)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:144)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:170)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:159)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:116)\r\n\tat base.TestBase.initialization(TestBase.java:54)\r\n\tat stepDefinition.PageObjectStepDef.open_chromebrowser_and_launch_application(PageObjectStepDef.java:35)\r\n\tat ✽.Given Open chromebrowser and launch application(Features/Pageobject.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 17
    },
    {
      "val": "password",
      "offset": 40
    }
  ],
  "location": "PageObjectStepDef.i_enter_correct_and_correct(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PageObjectStepDef.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PageObjectStepDef.Desired_page_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PageObjectStepDef.Browser_tear_down()"
});
formatter.result({
  "status": "skipped"
});
});