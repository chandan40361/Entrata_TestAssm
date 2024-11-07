package testCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TC004_HandleBrowserWindows {
	WebDriver driver;

	@Test
    public void setup() {
        
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.entrata.com/a");
        driver.manage().window().maximize();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement acceptCookiesButton = wait.until(
        ExpectedConditions.elementToBeClickable(By.id("cookie-accept")));
        acceptCookiesButton.click();
        
        String WindowID=driver.getWindowHandle();
        System.out.println(WindowID); //return ID of the single browser window
        
        driver.findElement(By.linkText("Schedule Your Demo")).click();
        Set<String> WindowIDs=driver.getWindowHandles(); //returns ids of multiple browser windows
        
        List<String> WindowList= new ArrayList(WindowIDs);
        String parentID=WindowList.get(0);
        String ChildID=WindowList.get(1);
        
        //Switch to child window
        driver.switchTo().window(ChildID);
       System.out.println(driver.getTitle());
       
     //Switch to Parent window
       driver.switchTo().window(parentID);
      System.out.println("Parent browser title :-" + driver.getTitle());
       
       
        
    }
	
	@AfterClass
    public void tearDown()
	{
		driver.quit();
	}
}
