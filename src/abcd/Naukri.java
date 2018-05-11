package abcd;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.19.0-win64\\geckodriver.exe");

        //WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        
        
        driver.get("https://www.naukri.com/");
        Thread.sleep(8000);
        
        
        //To login to Naukri website
        //driver.findElement(By.cssSelector("html body div div img")).sendKeys(Keys.chord(Keys.ALT, Keys.F4));	to close popups
        
        driver.findElement(By.id("login_Layer")).click(); //click on Login icon
        Thread.sleep(5000);
        
        //driver.findElement(By.xpath("//*[@id=\"loginLBNew\"]/div[1]")).click();
        
        //driver.findElement(By.id("eLoginNew")).sendKeys("smitha.sns91@gmail.com");
        //driver.findElement(By.xpath("//*[@id=\"eLoginNew\"]")).sendKeys("smitha.sns91@gmail.com");
        driver.findElement(By.name("email")).sendKeys("smitha.sns91@gmail.com");
        
                
        	driver.findElement(By.id("pLogin")).sendKeys("Hihowareyou1");
            //driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();   
        
            driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[2]/form/div[8]/button")).click(); //For firefox
            
       Thread.sleep(5000);
       
       WebElement element = driver.findElement(By.xpath("//*[@id=\"mainHeader\"]/div/div/ul[2]/li[2]/a")); //To hover on My Naukri icon
       Actions action = new Actions (driver);
       action.moveToElement(element).perform();
       WebElement editProfile = driver.findElement(By.xpath("//*[@id=\"mainHeader\"]/div/div/ul[2]/li[2]/div/ul/li[1]/a")); // Edit Profile
       action.moveToElement(editProfile);
       action.click();
       action.perform();
       
       
       Thread.sleep(5000);
       //To scroll down
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       
       jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

       WebElement element1 = driver.findElement(By.xpath("//*[@id=\"rPanel\"]/div/div/form/div[5]/div/button/div/b"));
       jse.executeScript("arguments[0].scrollIntoView(true);",element1);

       //jse.executeScript("window.scrollBy(0,250)");
       
       
       //To click on Save button
      // driver.findElement(By.xpath("//*[@id=\"rPanel\"]/div/div/form/div[5]/div/button/div/b")).click();
       
       
	}

}
