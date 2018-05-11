package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verification {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=gs3edjntvd3d5t3056u6ige0m2");
		WebElement checkbox = driver.findElement(By.name("newsletter"));
		
		boolean displaystatus = checkbox.isDisplayed();
		System.out.println(displaystatus);
		
		boolean enabledstatus = checkbox.isEnabled();
		System.out.println(enabledstatus);
		
		boolean selectedstatus = checkbox.isSelected();
		System.out.println(selectedstatus);
		
		checkbox.click();
		
		selectedstatus = checkbox.isSelected();
		System.out.println(selectedstatus);
		
		driver.close();	
		
	}

}
