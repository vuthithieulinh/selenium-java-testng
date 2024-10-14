package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.zeromq.ZThread;

public class Topic_11_WebBrowser_Exercise {
    WebDriver driver;

    @BeforeClass
    public void BeforeClass() {
        driver = new FirefoxDriver();
    }

    @Test
    public void TC_01_Verify_URL() throws InterruptedException {
        driver.get("http://live.techpanda.org/");

        driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();

        Assert.assertEquals(driver.getCurrentUrl(),"http://live.techpanda.org/index.php/customer/account/login/");

        driver.findElement(By.cssSelector("div>a[title='Create an Account']")).click();

        Assert.assertEquals(driver.getCurrentUrl(),"http://live.techpanda.org/index.php/customer/account/create/");

        Thread.sleep(3000);

    }
    @Test
    public void TC_02_Verify_Title() throws InterruptedException {
        driver.get("http://live.techpanda.org/");

        driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();

        Assert.assertEquals(driver.getTitle(),"Customer Login");

        driver.findElement(By.cssSelector("div>a[title='Create an Account']")).click();

        Assert.assertEquals(driver.getTitle(),"Create New Customer Account");

        Thread.sleep(3000);

    }
    @Test
    public void TC_03_Navigation_Function() throws InterruptedException {
        driver.get("http://live.techpanda.org/");

        driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();

        driver.findElement(By.cssSelector("div>a[title='Create an Account']")).click();

        Assert.assertEquals(driver.getCurrentUrl(),"http://live.techpanda.org/index.php/customer/account/create/");

        WebDriver.Navigation navigation = driver.navigate();
        navigation.back();

        Assert.assertEquals(driver.getCurrentUrl(),"http://live.techpanda.org/index.php/customer/account/login/");

        navigation.forward();
        Assert.assertEquals(driver.getTitle(),"Create New Customer Account");

        Thread.sleep(3000);

    }
    @Test
    public void TC_04_Get_Page_Source_Code() {
        driver.get("http://live.techpanda.org/");
        driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();

        String LoginPage = driver.getPageSource();
        Assert.assertTrue(LoginPage.contains("Login or Create an Account"));

        driver.findElement(By.cssSelector("div>a[title='Create an Account']")).click();
        Assert.assertTrue(LoginPage.contains("Create an Account"));

    }


    @AfterClass
    public void AfterClass() {
       // driver.quit();
    }
}
