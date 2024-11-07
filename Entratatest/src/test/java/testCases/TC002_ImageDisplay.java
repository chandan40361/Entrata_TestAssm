package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC002_ImageDisplay {
	WebDriver driver;

    @BeforeClass
    public void setup() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.entrata.com/a");
    }
    
    @Test
    public void verifyEntrataImage()
    {
    	WebElement entratalogo=driver.findElement(By.xpath("//body/div[5]/div[1]/a[1]/img[1]"));
    	Assert.assertTrue(entratalogo.isDisplayed());
    }
    
    @AfterClass
    public void tearDown()
	{
		driver.quit();
	}

}
