package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {

	public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.19.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("http://www.rediff.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
	}

}
