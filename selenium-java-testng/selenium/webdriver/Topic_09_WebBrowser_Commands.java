package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Topic_09_WebBrowser_Commands {
    WebDriver driver;

    @BeforeClass
    public void BeforeClass() throws MalformedURLException {
        // Run các browser trên máy local
        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver = new EdgeDriver();
        driver = new SafariDriver();
        driver = new InternetExplorerDriver();

        // Remote (Grid/ Docker/ Cloud Testing)
        // Networking (LAN/ WAN/ IP/ Port)
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("localhost:4444"), chromeOptions);
    }

    @Test
    public void TC_01_() {
        // Mo ra 1 URL bất kỳ (Lưu ý: Phải bắt đầu bằng http/https)
        driver.get("https://www.facebook.com/");

        // Đóng browser (Đóng tab hiện tại đang thao tác = active tab/window)
        driver.close();
        // Đóng browser tất cả các tab/ window
        driver.quit();

        // Lấy ra Title của page hiện tại
        // Hàm get là lấy dữ liệu ra để kiểm tra
        // Cách 1: Lấy Title ra sau đó lưu dữ liệu vào biến homePageTitle
        String homePageTitle = driver.getTitle();
        // Sau đó kiêm tra xem biến homePageTitle có giống với tên tiêu đề Login Facebook không
        Assert.assertEquals(homePageTitle,"Log in Facebook");

        // Cách 2: Kiểm tra trực tiếp
        Assert.assertEquals(driver.getTitle(),"Log in Facebook");

        // Lấy ra ỦL của page hện tại
        Assert.assertEquals(driver.getCurrentUrl(),"http://facebook.com");

        // Lấy ra page Sourch Code
        String homePageSourceCode = driver.getPageSource();
        // Kiểm tra (tương đối)
        Assert.assertTrue(homePageSourceCode.contains("Log in"));

        // Lấy ra ID của tab/window đang active
        driver.getWindowHandle();
        // Lấy ra tất cả ID của tất cả các tab/window đang c
        driver.getWindowHandles();

        // Đi tìm 1 element
        driver.findElement(By.xpath(""));
        // Đi tiìm nhiều Elements
        driver.findElements(By.xpath(""));

        // selenium version 3 - Lỗi thời nhưng vẫn dùng được
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.DAYS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.HOURS);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MICROSECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.NANOSECONDS);

        // selenium version 4
        // Dùng để chờ cho việc tìm element (findElement/findElements)
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(1));
        driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));

        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1));
        driver.manage().timeouts().implicitlyWait(Duration.ofNanos(1));

        // Dùng để chờ cho việc page được load xong
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

        // Dùng để chờ cho 1 đoạn script được thực thi xong
        // Javascrip -js
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));

        // Thu nhỏ về Taskbar để chạy
        driver.manage().window().minimize();
        // Phóng to lên (có taskbar)
        driver.manage().window().maximize();
        // phóng to lên ( tràn hết cả taskbar)
        driver.manage().window().fullscreen();

        // Dùng để test Reponsive (kích thước..)
        // Test GUI: Graphic User Interface
        // Font/ Color/ Size/ Position/ Location/...
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().window().getSize();

        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().getPosition();


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
