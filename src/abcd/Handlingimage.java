package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingimage {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.co.in/");
	String imageTitle = driver.findElement(By.id("hplogo")).getAttribute("title");
	System.out.println(imageTitle);
	
	Thread.sleep(5000);
	
	driver.navigate().to("http://newtours.demoaut.com");
	driver.findElement(By.name("login")).click(); 
	
	driver.close();
	
	}

}
