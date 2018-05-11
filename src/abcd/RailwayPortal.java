package abcd;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RailwayPortal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/");
        driver.findElement(By.id("usernameId")).sendKeys("gcreddy7");
        driver.findElement(By.className("loginPassword")).sendKeys("gld938");
        
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter captcha");
        String captcha = scan.nextLine();
        driver.findElement(By.id("nlpAnswer")).sendKeys(captcha);
        
        Thread.sleep(5000);
        
        driver.findElement(By.id("loginbutton")).click();
        
        
	}
	
}
