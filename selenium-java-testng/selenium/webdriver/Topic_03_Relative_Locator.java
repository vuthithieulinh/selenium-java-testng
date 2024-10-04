package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Topic_03_Relative_Locator {
    WebDriver driver;

    @BeforeClass
    public void BeforeClass() {
        driver = new FirefoxDriver();
        //Selenium version 3x
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Selenium version 4x
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void TC_01_Relative_Locator() {
        driver.get("http://live.techpanda.org/index.php/catalogsearch/advanced/");

//        //1 Khai báo biến
//        // Khi nào thì cần khai báo biến? -> Khi dữ liệu được sử dụng nhiều lần = tái sử dụng (Reuseable)
//        String emailAddress = "vuthithieulinh@gmail.com";
//        By emailTextboxBy =  By.cssSelector("");
//        WebElement emailTexboxElement = driver.findElement(emailTextboxBy);
//
//        emailTexboxElement.clear();
//        emailTexboxElement.isDisplayed();
//        emailTexboxElement.sendKeys("");
//
//        //2 - Không khai báo biến
//        // Khi chỉ dùng 1 lần
//        driver.findElement(emailTextboxBy).sendKeys("");

        //Selenium version 4
//        WebElement priceFromeElement = driver.findElement(RelativeLocator.with(By.tagName("input"))
//                .toLeftOf(By.name("price[to]"))
//                .below(By.id("sku"))
//                .above(By.id("tax_class_id")));
//        //System.out.println(priceFromeElement);
//        priceFromeElement.sendKeys("100");
    }
    @Test
    public void TC_02_XPath() {
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        //Gender
        driver.findElement(By.xpath("//input[@id='gender-male']"));
        driver.findElement(By.xpath("//input[@id='gender-male']"));

        //First name
        driver.findElement(By.xpath("//input[@id='FirstName']"));
        driver.findElement(By.xpath("//input[@name='FirstName']"));

        //Last name
        driver.findElement(By.xpath("//input[@id='LastName']"));
        driver.findElement(By.xpath("//input[@name='LastName']"));

        //Date of birth
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));

        //Email
        driver.findElement(By.xpath("//input[@name='Email']"));
        driver.findElement(By.xpath("//input[@id='Email']"));

        //Company name:
        driver.findElement(By.xpath("//input[@id='Company']"));
        driver.findElement(By.xpath("//input[@name='Company']"));

        //Checkbox: Newsletter
        driver.findElement(By.xpath("//input[@id='Newsletter']"));

        //Password
        driver.findElement(By.xpath("//input[@id='Password']"));
        driver.findElement(By.xpath("//input[@name='Password']"));

        //Confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));

        //Button Register
        driver.findElement(By.xpath("//button[@id='register-button']"));
        driver.findElement(By.xpath("//button[@name='register-button']"));

    }

    @AfterClass
    public void AfterClass() {
        //driver.quit();
    }
}
