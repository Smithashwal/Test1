package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {
public static WebDriver driver;	
		
@Test (priority =1 )
public void launchBrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

}

@Test (priority = 2)
public void verifygoogle() {
driver.get("https://www.google.co.in/");
String pageTitle = driver.getTitle();
Assert.assertEquals("Google", pageTitle);
}

@Test (priority = 3)
public void verifyYahoo() {
driver.get("https://in.yahoo.com/");
String pageTitle = driver.getTitle();
Assert.assertEquals("Yahoo", pageTitle);
}

@Test (priority = 4)
public void closeBrowser(){
driver.close();
}
}
