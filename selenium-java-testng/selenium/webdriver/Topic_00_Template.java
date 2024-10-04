package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Topic_00_Template {
    WebDriver driver;

    @BeforeClass
    public void BeforeClass() {
        driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void TC_01_() {
        driver.get("https://www.facebook.com/");

    }
    @Test
    public void TC_02_() {
        driver.get("https://www.facebook.com/");

    }


    @AfterClass
    public void AfterClass() {
        driver.quit();
    }
}
