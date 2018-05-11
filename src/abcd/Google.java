package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String browserURL = driver.getCurrentUrl();
		System.out.println(browserURL);
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.id("identifierId")).sendKeys("smitha.sns91");
		driver.findElement(By.tagName("content")).click();
		Thread.sleep(5000);
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Mridanga@1");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
		Thread.sleep(5000);
        driver.findElement(By.id("gb_71")).click();
	}
}
