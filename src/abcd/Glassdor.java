package abcd;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Glassdor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.glassdoor.co.in/");
        
        //To search jobs
        Thread.sleep(20000);
        driver.findElement(By.id("KeywordSearch")).sendKeys("Software Test Engineer");// Job title search
        
        //driver.findElement(By.id("LocationSearch")).sendKeys("Bengaluru");//Location search
        
        driver.findElement(By.id("HeroSearchButton")).click(); //To click on Search button
        
        String url = driver.getCurrentUrl();
        System.out.println(url);
	}

}
