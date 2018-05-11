package abcd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BO {

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_3.6.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(); */
		
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://ipphaptest02/BOE/BI");
		
		Thread.sleep(1000);
		
		WebElement iframe = driver.findElement(By.cssSelector("iframe[name='servletBridgeIframe']"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(iframe);
		
		
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:CMS']")).clear();
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:CMS']")).sendKeys("IPPHAPTEST02:6400");
		
		
		//*[@id="_id0:logon:CMS"]
		//*[@id="_id0:logon:CMS"]
		
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:USERNAME']")).clear();
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:USERNAME']")).sendKeys("ss043599");
		
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:PASSWORD']")).clear();
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:PASSWORD']")).sendKeys("Cerner");
		driver.findElement(By.xpath("//div[@class='logonButton']/input[@id='_id0:logon:logonButton']")).click(); 
		
		
		
		
		//WebElement username = driver.findElement(By.name("_id0:logon:USERNAME"));
		//WebElement username = driver.findElement(By.xpath("//*[@id=\"_id0:logon:USERNAME\"]"));
		WebElement username = driver.findElement(By.className("logonRow"));
		//WebElement username = driver.findElement(By.name("_id0:logon:USERNAME"));
		//WebElement username = driver.findElement(By.name("_id0:logon:USERNAME"));
		username.sendKeys("ss043599");
		
	}

}
