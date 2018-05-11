package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        
        //login to facebook
        String UserName = "smithaashwaldixit@gmail.com";
        String PassWord = "Gamanisu2017";
        
        driver.findElement(By.id("email")).sendKeys(UserName);
        driver.findElement(By.id("pass")).sendKeys(PassWord);
        driver.findElement(By.id("loginbutton")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[8]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/a[1]")).click(); //to click on not now button in notification window
        driver.findElement(By.className("_1vp5")).click(); // To click on Profile name
        
        Thread.sleep(5000);
        String Status = "Hello World";
        WebElement statusWindow = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/li/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div")); 
        statusWindow.click();
        Thread.sleep(5000);
        statusWindow.sendKeys(Status);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/li/div/div/div/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[3]/div/div[2]/div/button")).click(); 
	}
}
