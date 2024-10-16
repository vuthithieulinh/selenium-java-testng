package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

public class Topic_14_TextBox_TextArea {
    WebDriver driver;
    String firstName, lastName, emailAddress, password, fullName;
    Random rand;

    @BeforeClass
    public void BeforeClass() {
        driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        rand = new Random();
        firstName ="Linh";
        lastName="Vu";
        fullName= firstName+" "+lastName;
        emailAddress="vuthithieulinh" +rand.nextInt(9999)+ "@gmail.com";
        password="123456";

    }

    @Test
    public void TC_01_TechPanda() throws InterruptedException {
        driver.get("http://live.techpanda.org/");
        driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[text()='Account']")).click();
        driver.findElement(By.xpath("//div[@id='header-account']//a[text()='My Account']")).click();
        driver.findElement(By.xpath("//a[@class='button']//span[text()='Create an Account']")).click();

        driver.findElement(By.id("firstname")).sendKeys(firstName);
        driver.findElement(By.id("lastname")).sendKeys(lastName);
        driver.findElement(By.id("email_address")).sendKeys(emailAddress);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("confirmation")).sendKeys(password);

        driver.findElement(By.cssSelector("button[title='Register']")).click();

        Assert.assertEquals(driver.getCurrentUrl(),"http://live.techpanda.org/index.php/customer/account/index/");

        // Lay gia tri tuyet doi
        Assert.assertEquals(driver.findElement(By.xpath("//li[@class='success-msg']//span")).getText(),"Thank you for registering with Main Website Store.");

        String contactInformationText = driver.findElement(By.xpath(
                "//h3[text()='Contact Information']/parent::div/following-sibling::div/p")).getText();

        // Lay gia tri tuong doi
        // Lay tung thuoc tinh
            //Assert.assertTrue(contactInformationText.contains("")); // Full name
            //Assert.assertTrue(contactInformationText.contains("")); // Email
        // Hoac lay nhieu
        Assert.assertTrue(contactInformationText.contains(fullName) && contactInformationText.contains(emailAddress));

        driver.findElement(By.xpath("//h3[text()='Contact Information']//following-sibling::a")).click();
        Assert.assertEquals(driver.findElement(By.id("firstname")).getAttribute("value"),firstName);
        Assert.assertEquals(driver.findElement(By.id("lastname")).getAttribute("value"),lastName);
        Assert.assertEquals(driver.findElement(By.id("email")).getAttribute("value"),emailAddress);

        driver.findElement(By.xpath("//a[text()='Mobile']")).click();
        driver.findElement(By.xpath("//a[text()='Samsung Galaxy']")).click();
        driver.findElement(By.xpath("//a[text()='Add Your Review']")).click();
        driver.findElement(By.xpath("//input[@id='Quality 1_5']")).click();
        driver.findElement(By.cssSelector("textarea#review_field")).sendKeys("Prety easy\nto navigate");
        driver.findElement(By.cssSelector("input#summary_field")).sendKeys("Number1");
        driver.findElement(By.cssSelector("input#nickname_field")).clear();
        driver.findElement(By.cssSelector("input#nickname_field")).sendKeys(fullName);

        driver.findElement(By.xpath("//span[text()='Submit Review']")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector("li.success-msg span")).getText(),"Your review has been accepted for moderation.");

        //Logout
        driver.findElement(By.cssSelector("div.account-cart-wrapper>a")).click();
        driver.findElement(By.xpath("//a[@title='Log Out']")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"http://live.techpanda.org/index.php/customer/account/logoutSuccess/");

    }
        @AfterClass
        public void AfterClass () {

            //driver.quit();
        }
}
