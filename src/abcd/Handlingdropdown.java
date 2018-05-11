package abcd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdown {

	public static void main(String[] args) {

	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	boolean status;
	
	driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=7u1anl9ha5gejotirul66opl33");
	WebElement dropDown = driver.findElement(By.name("country"));
	status = dropDown.isDisplayed();
	System.out.println(status);
	
	status = dropDown.isEnabled();
	System.out.println(status);
	
	Select dropdownbutton = new Select(dropDown);
	
	dropdownbutton.selectByVisibleText("India");
	
	List <WebElement> e = dropdownbutton.getOptions();
	System.out.println(e.size());
	
	driver.close();
	
	}

}
