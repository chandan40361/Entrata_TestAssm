package testCases;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC001_HomePageTitleTest {
	
	WebDriver driver;

    @BeforeClass
    public void setup() {
        
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.entrata.com/a");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyHomePageTitleURL() {
        String expectedTitle = "Property Management Software | Entrata";
        String actualTitle = driver.getTitle();
        System.out.println("Title of home page is:- "+ actualTitle );
       String actualURL= driver.getCurrentUrl();
       System.out.println("URL of current page is:- "+actualURL );
       String expectedURL="https://www.entrata.com/a";
        Assert.assertEquals(actualTitle, expectedTitle, "Home page title does not match.");
        Assert.assertEquals(actualURL, expectedURL, "Home page URL does not match.");
    }

    @AfterClass
    public void tearDown()
	{
		driver.quit();
	}

}
