package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_By_Locator {
    WebDriver driver;

    @BeforeClass
    public void BeforeClass() {
        driver = new FirefoxDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    //ID,class,name phải là duy nhất
    public void TC_01_ID() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.id("txtSearch"));
        driver.findElement(By.id("txtFirstname"));
        driver.findElement(By.id("txtEmail"));
        driver.findElement(By.id("txtCEmail"));
        driver.findElement(By.id("txtPassword"));
        driver.findElement(By.id("txtCPassword"));
        driver.findElement(By.id("txtPhone"));
        driver.findElement(By.id("chkRight"));
        driver.findElement(By.id("leftcontent"));
    }
    @Test
    public void TC_02_Class() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.className("main"));
        driver.findElement(By.className("box-icon"));
        driver.findElement(By.className("groupmenu"));
        driver.findElement(By.className("subul3"));
        driver.findElement(By.className("box-hoptac"));
        driver.findElement(By.className("box-search"));
        driver.findElement(By.className("login"));
    }
    @Test
    public void TC_03_Name() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.name("txtFirstname"));
        driver.findElement(By.name("txtEmail"));
        driver.findElement(By.name("txtCEmail"));
        driver.findElement(By.name("txtPassword"));
        driver.findElement(By.name("txtCPassword"));
        driver.findElement(By.name("txtPhone"));
        driver.findElement(By.name("chkRight"));
        driver.findElement(By.name("txtFirstname"));
        driver.findElement(By.name("txtFirstname"));

    }
    @Test
    public void TC_04_Link() {
        //Chỉ dùng được với đường link có text (Text trên UI)
        //Truyền hết cả chuỗi vào
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");

        driver.findElement(By.linkText("Hướng dẫn"));
        driver.findElement(By.linkText("chính sách"));
        driver.findElement(By.linkText("Đăng Ký"));
        driver.findElement(By.linkText("Đăng Nhập"));
        driver.findElement(By.linkText("chính sách"));
        driver.findElement(By.linkText("thỏa thuận sử dụng"));
        driver.findElement(By.linkText("Giới thiệu"));
        driver.findElement(By.linkText("Liên hệ"));
        driver.findElement(By.linkText("Chính sách bảo mật"));
        driver.findElement(By.linkText("Điều khoản dịch vụ"));
        driver.findElement(By.linkText("Quy chế hoạt động"));
        driver.findElement(By.linkText("Hướng dẫn sử dụng"));
        driver.findElement(By.linkText("Câu hỏi thường gặp"));
        driver.findElement(By.linkText("Hướng dẫn thanh toán"));
        driver.findElement(By.linkText("Chính sách hoàn trả học phí"));
        driver.findElement(By.linkText("Hợp tác giảng dạy"));
    }
    @Test
    public void TC_05_PartialLink() {
        //Chỉ dùng được với đường link có text thôi
        //Truyền hết cả chuỗi text vào cũng được
        //Truyền 1 phần chuỗi text vào cũng được
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");

        driver.findElement(By.partialLinkText("Hướng"));
        driver.findElement(By.partialLinkText("sách"));
        driver.findElement(By.partialLinkText("Ký"));
        driver.findElement(By.partialLinkText("Nhập"));
        driver.findElement(By.partialLinkText("chính"));
        driver.findElement(By.partialLinkText("thỏa thuận"));
        driver.findElement(By.partialLinkText("Giới"));
        driver.findElement(By.partialLinkText("hệ"));
        driver.findElement(By.partialLinkText("Chính sách bảo mật"));
        driver.findElement(By.partialLinkText("Điều khoản dịch vụ"));
        driver.findElement(By.partialLinkText("Quy chế hoạt động"));
        driver.findElement(By.partialLinkText("Hướng dẫn sử dụng"));
        driver.findElement(By.partialLinkText("Câu hỏi thường gặp"));
        driver.findElement(By.partialLinkText("Hướng dẫn thanh toán"));
        driver.findElement(By.partialLinkText("Chính sách hoàn trả học phí"));
        driver.findElement(By.partialLinkText("Hợp tác giảng dạy"));
    }
    @Test
    public void TC_06_TagName() {
        //Tìm nhiều Element giống nhau
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        int LinkNumber = driver.findElements(By.tagName("a")).size();
        System.out.println("Tổng số lượng link =" + LinkNumber);
        //Tagname giống nhau nhưng element khác nhau
        //Ví dụ thẻ Input có: textbox/checkox/radio....
    }
    @Test
    public void TC_07_CSS() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
//        int TextNumber = driver.findElements(By.cssSelector("input[type=\"text\"]")).size();
//        System.out.println("Tổng số lượng link =" + TextNumber);

        //Dùng CSS cho tất cả các loại trên (Có 3 cách viết)
        //CSS với ID
        driver.findElement(By.cssSelector("input[id='txtSearch']"));
        driver.findElement(By.cssSelector("#txtSearch"));
        driver.findElement(By.cssSelector("input#txtSearch"));

        driver.findElement(By.cssSelector("input[id='txtFirstname']"));
        driver.findElement(By.cssSelector("#txtFirstname"));
        driver.findElement(By.cssSelector("input#txtFirstname"));

        driver.findElement(By.cssSelector("input[id='txtEmail']"));
        driver.findElement(By.cssSelector("#txtEmail"));
        driver.findElement(By.cssSelector("input#txtEmail"));

        driver.findElement(By.cssSelector("input[id='txtCEmail']"));
        driver.findElement(By.cssSelector("#txtCEmail"));
        driver.findElement(By.cssSelector("input#txtCEmail"));

        driver.findElement(By.cssSelector("input[id='txtPassword']"));
        driver.findElement(By.cssSelector("#txtPassword"));
        driver.findElement(By.cssSelector("input#txtPassword"));

        driver.findElement(By.cssSelector("input[id='txtCPassword']"));
        driver.findElement(By.cssSelector("#txtCPassword"));
        driver.findElement(By.cssSelector("input#txtCPassword"));

        driver.findElement(By.cssSelector("input[id='txtPhone']"));
        driver.findElement(By.cssSelector("#txtPhone"));
        driver.findElement(By.cssSelector("input#txtPhone"));

        driver.findElement(By.cssSelector("input[id='chkRight']"));
        driver.findElement(By.cssSelector("#chkRight"));
        driver.findElement(By.cssSelector("input#chkRight"));

        driver.findElement(By.cssSelector("div[id='leftcontent']"));
        driver.findElement(By.cssSelector("#leftcontent"));
        driver.findElement(By.cssSelector("div#leftcontent"));

        //CSS với Class (Class dùng dấu chấm)
        driver.findElement(By.cssSelector("div[class='flogo']"));
        driver.findElement(By.cssSelector("div.flogo"));
        driver.findElement(By.cssSelector(".flogo"));
            //Trường hợp ngoại lệ có khoảng trắng
        driver.findElement(By.cssSelector("div[class='head-col-right visible-xs']"));
        driver.findElement(By.cssSelector(".head-col-right.visible-xs")); //them dau .
        driver.findElement(By.cssSelector("div.head-col-right.hidden-xs"));
        driver.findElement(By.cssSelector("div.head-col-right"));

        //CSS với Name
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.cssSelector("input[name='txtFirstname']"));
        driver.findElement(By.cssSelector("input[name='txtEmail']"));
        driver.findElement(By.cssSelector("input[name='txtCEmail']"));
        driver.findElement(By.cssSelector("input[name='txtPassword']"));
        driver.findElement(By.cssSelector("input[name='txtCPassword']"));
        driver.findElement(By.cssSelector("input[name='txtPhone']"));

        //CSS với Link
        //CSS không dùng được với text, lấy hết toàn bộ link
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.cssSelector("a[href='https://alada.vn/tai-khoan/dang-nhap.html']"));

        //CSS với PartialLink
        ////CSS không dùng được với text, lấy 1 phần đường link
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.cssSelector("a[href^='https://alada.vn/cau-hoi-thuong-gap.html']"));// đoạn đầu
        driver.findElement(By.cssSelector("a[href*='da.vn/cau-hoi-']")); // all
        driver.findElement(By.cssSelector("a[href$='au-hoi-thuong-gap.html']")); // đoạn cuối

        //CSS với Tagname
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        int LinkNumber = driver.findElements(By.tagName("a")).size();
        System.out.println("Tổng số lượng link =" + LinkNumber);
    }
    @Test
    public void TC_08_XPath() {
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        //Xpath với ID
        driver.findElement(By.xpath("//input[@id='txtFirstname']"));

        //Xpath với class
        driver.findElement(By.xpath("//div[@class='flogo']"));

        //Xpath với name
        driver.findElement(By.xpath("//input[@name='txtFirstname']"));

        //Xpath với link (Dùng được với link text hoặc không)
        driver.findElement(By.xpath("//a[@href='https://alada.vn/tai-khoan/dang-nhap.html']"));
        driver.findElement(By.xpath("//a[text()='Đăng Nhập']"));

        //Xpath với partial link
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.xpath("//a[starts-with(@href,'https://alada.vn/cau-hoi-thuong-gap.html')]"));
        driver.findElement(By.xpath("//a[contains(@href,'n/cau-hoi-thuong-gap.html')]"));
        //Xpath không support với ends-with

        //Xpath với Tagname
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        int LinkNumber = driver.findElements(By.xpath("//a")).size();
        System.out.println("Tổng số lượng link =" + LinkNumber);
    }

    @AfterClass
    public void AfterClass() {
       driver.quit();
    }
}
