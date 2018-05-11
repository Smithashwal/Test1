package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingbutton {

	public static void main(String[] args) {

    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.19.0-win64\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    
    driver.get("https://accounts.google.com/signin");
    
    boolean displayStatus =driver.findElement(By.className("CwaK9")).isDisplayed();
    boolean enabledStatus = driver.findElement(By.className("CwaK9")).isEnabled();
    
    String typeoftheElement = driver.findElement(By.className("CwaK9")).getAttribute("role");
    
   // driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	
	System.out.println(displayStatus);
	System.out.println(enabledStatus);
	System.out.println(typeoftheElement);
	
	
	
	}

}
