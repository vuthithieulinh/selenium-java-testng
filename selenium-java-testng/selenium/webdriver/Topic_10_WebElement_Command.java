package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
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

public class Topic_10_WebElement_Command {
    //Chua cac ham de tuong tac voi Browser
    WebDriver driver;
    // Muon dung nhieu thi khai bao bien
    WebElement element;

    @BeforeClass
    public void BeforeClass() throws MalformedURLException {
        driver = new FirefoxDriver();
    }

    @Test
    public void TC_01_WebElement() {
        // Dùng 1 lần
        driver.findElement(By.xpath("")).click(); // **
        // Dùng nhiều lần thì khai báo biến
        element = driver.findElement(By.xpath(""));

        // Click vào các element dạng: button/ checkbox/ radio/ link/ image/ icon/...
        element.click();

        // Nhập liệu các element dạng: textbox/ textarea/ dropdown (edit)
        element.clear(); //Xóa dữ liệu trước khi sendkey // *
        element.sendKeys(""); // **
        element.sendKeys(Keys.ENTER);


        // Có thể tìm nhiều Element từ cha đi vào con nhưng không cần thiết
        driver.findElement(By.cssSelector("div.login-page"))
                .findElement(By.cssSelector("div.customer-blocks"))
                .findElement(By.id("Email")); // **
        // Dùng thế này cho nhanh
        driver.findElement(By.cssSelector("div.login-page div.customer-blocks input#Email"));

        // Tác dụng với thẻ form (SignUp/ Login/ Search/ ...)
        element.submit();
        driver.findElement(By.id("Email")).sendKeys("vuthithieulinh@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456789");
        driver.findElement(By.id("Password")).submit(); // Kiểu nhập xong ấn enter

        // Áp dụng cho tất cả các loại element
        // Kiểm tra 1 element có hiển thị hay không (Tức là có size >0: width/ height >0) => Nhìn thấy được/ thao tác được
        // Hàm nào có chữ is tức là đại diện kiểu trả về boolean true/false
        element.isDisplayed(); // **
        // Muốn hiển thị thì dùng assertTrue
        Assert.assertTrue(element.isDisplayed());
        // Không muốn hiển thị thì dùng assertFalse
        Assert.assertFalse(element.isDisplayed());

        // Áp dụng cho duy nhất 3 loại (lựa chọn): checkbox/ radio/ dropdown (mặc định)
        // Kiểm tra 1 element đã được chọn rồi hay chưa chọn
        element.isSelected(); // *
        // Chọn rồi thì dùng assertTrue
        Assert.assertTrue(element.isSelected());
        // Chưa chọn thì dùng assertFalse
        Assert.assertFalse(element.isSelected());

        // Áp dụng cho tất cả các loại
        // Kiểm tra 1 element có bị disable hay không (read-only)
        element.isEnabled();
        // Nếu enable thì dùng assertTrue
        Assert.assertTrue(element.isEnabled());
        // Nếu disable thì dùng assertFalse
        Assert.assertFalse(element.isEnabled());

        // Dùng để test GUI: Font/ Size/ Color/ Position/ Location/...
        // Ví dụ để so sánh xem có đúng màu font này không #0700e5
        element.getCssValue("background-color"); // *
        // Ví dụ để xem font size có chuẩn không 15px
        element.getCssValue("font-size");

        // Áp dụng cho các element chứa text (Link, button. Header/ Label....) Thằng nào có text thì lấy được hết
        element.getText(); // **

        // Lấy giá trị gì cũng được
        element.getAttribute("placeholder"); // Search store // **

        Dimension dimensionBrowser =  driver.manage().window().getSize();
        // Kiểm tra chiều rộng/ chiều cao của element?
        Dimension dimensionElement =  element.getSize();

        Point pointBrowser = driver.manage().window().getPosition();
        // Kiểm tra vị trí của element so với viewport
        Point pointElement = element.getLocation();

        // Là tổng hợp của 2 thằng getSize và getLocation
        // Muốn lấy cả 2 thì quất thằng này vào
        Rectangle rectangle = element.getRect();
        //Size
        rectangle.getWidth();
        rectangle.getHeight();
        rectangle.getDimension();
        // Location
        rectangle.getX();
        rectangle.getY();
        rectangle.getPoint();

        // Lấy ra cái thẻ HTML của element đó
        element.getTagName();
        // Ví dụ: element A
        String tagname = driver.findElement(By.cssSelector("#Email")).getTagName();
        // Element B
        driver.findElement(By.xpath("//" + tagname + "[@id='LastName']"));

        // Dev tool của chrome -> Accessibility/Name
        // Lấy ra cái tên Name trong dev tool chrome -> js -> Accessibility (nếu có)
        element.getAccessibleName();
        System.out.println(driver.findElement(By.id("First name")).getAccessibleName());

        // Lấy ra tên của Role trong dev tool chrome -> js -> Accessibility (nếu có)
        element.getAriaRole();
        System.out.println(driver.findElement(By.id("First name")).getAriaRole());

        //Dev tool chrome lấy attribute
        element.getDomAttribute("data-val-required");

        //Dev tool chrome -> js -> tab Properties
        element.getDomProperty("attributeStyleMap"); // *

        // popup
        element.getShadowRoot(); // **

        // Framework: HTML Report
        element.getScreenshotAs(OutputType.FILE); // *
        element.getScreenshotAs(OutputType.BYTES);
        element.getScreenshotAs(OutputType.BASE64); // *
//========TONG KET===================================
// * : Có dùng nhưng ít
// ** : Có dùng và dùng rất nhiều
// Có ~9 - 10 hàm
        //driver.findElement(By.xpath("")).click();
        //element.sendKeys("");
        //driver.findElement(By.cssSelector("div.login-page"))
        //element.isDisplayed();
        //element.getText();
        //element.getShadowRoot();
        //element.getAttribute("placeholder");
// Tổng cộng ~ 60 hàm nhưng Selenium (10 hàm element + 5 hàm browser +..) ~ 20 hàm tổng cộng (ước tính) hay dùng
    }
}
