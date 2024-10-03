package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Topic_05_Demo_Xpath {
    WebDriver driver;

    @BeforeClass
    public void BeforeClass() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void TC_01_Xpah_Demo_Text() {
        driver.get("https://automationfc.github.io/basic-form/");
        //Cùng hàng với tagname,không phải child note
        //Lấy giá trị tuyệt đối - Không khoảng trắng/xuống dòng/tab/
        driver.findElement(By.xpath("//legend[text()='XPath Tip and Trick']']"));

    }
    @Test
    public void TC_02_Xpath_Demo_Contains_Text() {
        driver.get("https://automationfc.github.io/basic-form/");
        //Text nằm trong chinnh note đó, không lấy trong note con
        //Nedtext nhưng chỉ lấy được text ở index 1
        //Lấy được khoảng trắng/xuống dòng/tab vì tương đối mà
        //Ví dụ
        driver.findElement(By.xpath("//h5[contains(text(),'Michael Jackson')]"));

    }
    @Test
    public void TC_03_Xpath_Demo_Contains() {
        driver.get("https://automationfc.github.io/basic-form/");
        //Work được tất cả các trường hợp. Không loại trừ bất kỳ trường hợp nào
        // Chỉ xử lý từng trường hợp 1
        //VD: Hello World! (Ignore Me) @04:45 PM -> Mỗi text này là 1 trường hợp nên chỉ xử lý từng trường hợp 1
        driver.findElement(By.xpath("//h5[contains(.,'Michael Jackson')]")); // ra 8 cái
    }
    @Test
    public void TC_04_Xpath_Demo_Contains_String() {
        driver.get("https://automationfc.github.io/basic-form/");
        //Giống với //tagname[contains(.,"")]
        driver.findElement(By.xpath("//h5[contains(string(),'Michael Jackson')]")); // ra 8 cái
    }
    @Test
    public void TC_04_Xpath_Demo_concat() {
        driver.get("https://automationfc.github.io/basic-form/");
        // Nối 2 chuỗi thành 1
        // Ví dụ: Hello "John", What's happened? => Nháy đơn bọc nháy đôi - Nháy đôi bọc nháy đơn
        driver.findElement(By.xpath("//span[text()=concat('Hello \"John\", What',\"'s happened?)]"));

    }
    @Test
    public void TC_04_AND_OR() {
        driver.get("https://automationfc.github.io/basic-form/");
        // AND là giá trị tuyệt đối cần đủ các điều kiện mới thỏa mãn
        // OR là giá trị tương đối cần 1 trong các điều kiện đúng thì sẽ đúng
        driver.findElement(By.xpath("//textarea[@name='user_edu' and @id='edu']"));
        driver.findElement(By.xpath("//textarea[@name='abcxyz' or @id='edu']"));

    }
    @Test
    public void TC_05_NOT() {
        driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
        // Not dùng để phủ định lại điều kiện
        driver.findElement(By.xpath("//div[not(@style='display:none;')]/div[@class='raDiv']"));
    }
    @Test
    public void TC_06_Inside_Parent() {
        driver.get("https://automationfc.github.io/jquery-selectable/");
        //Inside là có nhiều các element cùng nằm trong 1 cha
        //Dùng index[] phía sau để tìm
        driver.findElement(By.xpath("//ol[@id='selectable']/li[2]"));
    }
    @Test
    public void TC_06_Outside_Parent() {
        driver.get("d");
        //Outside là có nhiều các element không nằm trong cùng 1 cha
        //Dùng index[] phía sau để tìm
        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[3]"));
    }
    @Test
    public void TC_07_position_Parent() {
        driver.get("http://live.techpanda.org/index.php/mobile.html");
        //Vị trí của cái Element, giống như index
        driver.findElement(By.xpath("//ol[@id='selectable']/li[position()=3]"));
    }
    @Test
    public void TC_08_last() {
        driver.get("http://live.techpanda.org/index.php/mobile.html");
        //Lấy thằng cuối cùng trong trường hợp code có thay đổi thêm các trường. Muốn biết thằng nào cuối thì dùng last()
        driver.findElement(By.xpath("//ol[@id='selectable']/li[last()]"));
    }
    @Test
    public void TC_08_nearby_last() {
        driver.get("http://live.techpanda.org/index.php/mobile.html");
        //Lấy thằng gần cuối cùng. Dùng last()-1
        driver.findElement(By.xpath("//ol[@id='selectable']/li[last()-1]"));

        //Hoặc dùng hàm count để đếm số lượng các element sau đó -1 để xem thằng gần cuối
        driver.findElement(By.xpath("//ol[@id='selectable']/li[count(//li)-1]"));

    }
    @AfterClass
    public void AfterClass() {
        driver.quit();
    }
}
