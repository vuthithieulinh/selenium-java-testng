package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Topic_06_Xpath_AXES {
    WebDriver driver;

    @BeforeClass
    public void BeforeClass() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void TC_01_ViDu() {
        driver.get("http://live.techpanda.org/index.php/mobile.html");
        /*Trường hợp nếu như thay đổi vị trí thì mình vẫn có thể lấy được
        Đang đứng ở node hiện tại nếu:
        -Muốn đi lên node cha: parent::tagname
        - Muốn đi lên node tổ tiên (cha/ông/cụ/kị....): ancestor::tagname
        - Muốn đi lên node anh: preceding-sibling::tagname
        - Muốn đi xuống node em: following-sibling::tagname
        - Muốn đi xuống node con: child:tagname
        - Muốn đi xuống node hậu duệ (con/cháu/chắt/chút): descendant::tagname
        */
        driver.findElement(By.xpath("//a[text()='IPhone']/parent::h2/following-sibling::div[@class='actions']/button"));

        // 2 // là di từ trên xuống vào bất kỳ node con/cháu/... bên dưới
        driver.findElement(By.xpath("//a[text()='IPhone']/ancestor::div[@class='category-products']//*"));

        // 1 / là đi từ trên xuống nhưng không vao node con
        driver.findElement(By.xpath("///a[text()='IPhone']/ancestor::div[@class='category-products']/*"));
    }

    @AfterClass
    public void AfterClass() {
        driver.quit();
    }
}
