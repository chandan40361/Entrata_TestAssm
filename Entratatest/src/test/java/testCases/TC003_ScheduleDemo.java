package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC003_ScheduleDemo {
	WebDriver driver;

	@BeforeClass
    public void setup() {
        
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.entrata.com/a");
        driver.manage().window().maximize();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement acceptCookiesButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.id("cookie-accept")) //
        );
        acceptCookiesButton.click();
    }
    
    @Test
    public void scheduleDemo() throws InterruptedException
    {
    	driver.findElement(By.linkText("Schedule Your Demo")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Prashant");
    	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Singh");
    	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("bhf.234@gmail.com");
    	driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Entrata");
    	driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys("8722197473");
    	driver.findElement(By.xpath("//input[@id='Title']")).sendKeys("QA Analyst");
    	
    	//Handling Select Drop-down
    	WebElement drpUnitCount=driver.findElement(By.xpath("//select[@id='Unit_Count__c']"));
    	WebElement drpIam=driver.findElement(By.xpath("//select[@id='demoRequest']"));
    	
    	Select unitCount = new Select (drpUnitCount);
    	Select Iam = new Select (drpIam);
    	
    	//Select I am option from drop-down  
    	unitCount.selectByVisibleText("1 - 10");
    	Iam.selectByVisibleText("a Resident");
    	
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	
    }
    	
 
    
    @AfterClass
    public void tearDown()
	{
		driver.quit();
	}
    	

 }
