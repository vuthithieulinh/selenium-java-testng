package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Topic_07_Run_On_Browser_Version_3x {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");


    @Test
    public void TC_01_Run_On_Firefox() {
        //Từ version 4.6 trở về 3.x đều câ setting brower driver mới chạy đuơc
        System.setProperty("webdriver.gecko.driver",projectPath+"\\BrowserDrivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://live.techpanda.org/index.php/mobile.html");
       driver.quit();
    }

    @Test
    public void TC_02_Run_On_Chrome() {
        //Từ version 4.6 trở về 3.x đều câ setting brower driver mới chạy đuơc
        System.setProperty("webdriver.chrome.driver",projectPath+"\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://live.techpanda.org/index.php/mobile.html");
        driver.quit();
    }

    @Test
    public void TC_03_Run_On_Edge() {
        //Từ version 4.6 trở về 3.x đều câ setting brower driver mới chạy đuơc
        System.setProperty("webdriver.edge.driver",projectPath+"\\BrowserDrivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("http://live.techpanda.org/index.php/mobile.html");
        driver.quit();
    }
}
