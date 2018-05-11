package abcd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class textareaerrorpopup {

	public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.19.0-win64\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    
    driver.get("https://accounts.google.com/signin");
    String textArea = driver.findElement(By.tagName("h1")).getText();
    System.out.println(textArea);
    
    driver.findElement(By.className("CwaK9")).click();// click on Next button in gmail
    Thread.sleep(3000);
    String errorMsg = driver.findElement(By.className("LXRPh")).getText();
    System.out.println(errorMsg);
    
    driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
    driver.findElement(By.name("proceed")).click(); //click on Go button Rediff mail
    
    Alert popUp = driver.switchTo().alert();
    String errorMsg2 = popUp.getText();
    popUp.accept();
    System.out.println(errorMsg2);
    
    driver.close();
    
    
	}

}
