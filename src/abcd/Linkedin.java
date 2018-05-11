package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Linkedin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/"); // To open Linkedin site
		driver.findElement(By.id("login-email")).sendKeys("smitha.sns91@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Mridanga@1");
		driver.findElement(By.id("login-submit")).click();

		Thread.sleep(7000);

		// To click on Jobs
		driver.findElement(By.id("jobs-tab-icon")).click();
		Thread.sleep(5000);

		WebElement searchJobs = driver.findElement(By.xpath(".//*[@id='careers']/section"));
		/*
		 * boolean displayedStatus = searchJobs.isDisplayed();
		 * System.out.println(displayedStatus);
		 * 
		 * boolean enabledStatus = searchJobs.isEnabled();
		 * System.out.println(enabledStatus);
		 */
		// searchJobs.click();

		/*
		 * Actions actions = new Actions(driver); actions.moveToElement(searchJobs);
		 * actions.click(); actions.sendKeys("Test Automation Engineer");
		 */

		Actions actions = new Actions(driver);
		
		actions.moveToElement(searchJobs).click().sendKeys("test").perform();
		// searchJobs.sendKeys("Test Automation Engineer");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".jobs-search-box__submit-button.button-secondary-large-inverse")).click();

	}

}
