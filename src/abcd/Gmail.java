package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		
		String Username= "smitha.sns91";
		String Password= "";
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com"); //opening gmail page
		String browserUrl = driver.getCurrentUrl();
		System.out.println(browserUrl);
		
		
	
		//Login page
		driver.findElement(By.id("identifierId")).sendKeys(Username);
		driver.findElement(By.className("CwaK9")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.className("CwaK9")).click();
		
		//To check whether the main gmail page is displayed or some other page is displayed
		/*driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]")).click();
		String currentPage = null;
		if (currentPage == url) {  
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]")).click();
		}
		else {
			Thread.sleep(5000);
		}*/
		
		String url = driver.getCurrentUrl();// inbox page
		System.out.println(url);
		Thread.sleep(5000);
		
	     //To select Social tab , Select and delete all the mails
		driver.findElement(By.xpath("//*[@id=\":2p\"]/div[5]")).click();
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\":30\"]/div[1]/div"));
		boolean displayedStatus = dropdown.isDisplayed();
		System.out.println(displayedStatus);
		boolean enabledStatus = dropdown.isEnabled();
		System.out.println(enabledStatus);
		driver.findElement(By.id(":30")).click();
		driver.findElement(By.xpath("//*[@id=\":5\"]/div/div[1]/div[1]/div/div/div[2]/div[3]")).click();
		
		Thread.sleep(10000);
		
		//To select Promotions tab, select and delete all the mails
		driver.findElement(By.xpath("//*[@id=\":2q\"]/div[5]")).click();
		WebElement dropdown1= driver.findElement(By.xpath("//*[@id=\":30\"]/div[1]"));
		displayedStatus = dropdown1.isDisplayed();
		System.out.println(displayedStatus);
		enabledStatus = dropdown1.isEnabled();
		System.out.println(enabledStatus);
		driver.findElement(By.id(":30")).click();
		driver.findElement(By.xpath("//*[@id=\":5\"]/div/div[1]/div[1]/div/div/div[2]/div[3]")).click();
		

		//to clear all mails in spam
		
		driver.findElement(By.className("CJ")).click();//To click on More option in left
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.id(":iw"));// To hover on Less option in left
		Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        WebElement spamElement = driver.findElement(By.xpath("//*[@id=\":j6\"]/div/div[2]"));
        action.moveToElement(spamElement);
        action.click();
        action.perform();
		
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\":l6\"]/div[1]")).click();  
        Thread.sleep(10000);
		driver.findElement(By.className("Bn")).click();
		
		//driver.close();
	}

}
