package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_12_WebElement_Exercise_I {
    WebDriver driver;
    WebElement element;

    @BeforeClass
    public void BeforeClass() {
        driver = new FirefoxDriver();
    }

    @Test
    public void TC_01_IsDisplayed() throws InterruptedException {
        //
        driver.get("https://automationfc.github.io/basic-form/index.html");

        WebElement EmailTextbox = driver.findElement(By.cssSelector("#email"));
        if (EmailTextbox.isDisplayed()){
            System.out.println("Email Textbox is displayed");
            EmailTextbox.sendKeys("Email Textbox Test");
        }else{
            System.out.println("Email Textbox is not displayed");
        }

      WebElement AgeUnder18Radio = driver.findElement(By.cssSelector("#under_18"));
        if (AgeUnder18Radio.isDisplayed()){
            System.out.println("Age Under 18 Radio is displayed");
            AgeUnder18Radio.click();
        }else{
            System.out.println("Age Under 18 Radio is not displayed");
        }

      WebElement EducationTextarea = driver.findElement(By.cssSelector("#edu"));
        if (EducationTextarea.isDisplayed()){
            System.out.println("Education Textarea is displayed");
            EducationTextarea.sendKeys("Education Textarea Test");
        }else {
            System.out.println("Education Textarea is not displayed");
        }

      WebElement User05Text = driver.findElement(By.xpath("//div[@class='figcaption']/h5[text()='Name: User5']"));
        if(User05Text.isDisplayed()){
            System.out.println("User05Text is displayed");
        }else{
            System.out.println("User05Text is not displayed");
        }
        Thread.sleep(3000);
    }

    @Test
    public void TC_02_IsEnabled() throws InterruptedException {
        driver.get("https://automationfc.github.io/basic-form/index.html");

        System.out.println("========= Kiểm tra phần tử Enable =========");
        WebElement EmailTextbox = driver.findElement(By.cssSelector("input#mail"));
        if (EmailTextbox.isEnabled()){
            System.out.println("Email Textbox is enable");
        }else{
            System.out.println("Email Textbox is not enable");
        }

        WebElement AgeUnder18Radio = driver.findElement(By.cssSelector("input#under_18"));
        if (AgeUnder18Radio.isEnabled()){
            System.out.println("Age Under 18 Radio is enable");
            AgeUnder18Radio.click();
        }else{
            System.out.println("Age Under 18 Radio is not enable");
        }

        WebElement EducationTextarea = driver.findElement(By.cssSelector("textarea#edu"));
        if(EducationTextarea.isEnabled()){
            System.out.println("Education Textarea is enable");
        }else{
            System.out.println("Education Textarea is not enable");
        }

        WebElement JobRole1Select = driver.findElement(By.cssSelector("select#job1"));
        if(JobRole1Select.isEnabled()){
            System.out.println("JobRole1Select is enable");
        }else{
            System.out.println("JobRole1Select is not enable");
        }

        WebElement JobRole2Dropdown = driver.findElement(By.cssSelector("select#job2"));
        if(JobRole2Dropdown.isEnabled()){
            System.out.println("Job Role2 Dropdown is enable");
        }else{
            System.out.println("Job Role2 Dropdown is not enable");
        }

        WebElement InterestsCheckbox = driver.findElement(By.cssSelector("input#development"));
        if(InterestsCheckbox.isEnabled()){
            System.out.println("Interests Checkbox is enable");
        }else{
            System.out.println("Interests Checkbox is not enable");
        }

        WebElement Slider01 = driver.findElement(By.cssSelector("input#slider-1"));
        if(Slider01.isEnabled()){
            System.out.println("Slider 01 is enable");
        }else{
            System.out.println("Slider 01 is not enable");
        }

        System.out.println("========= Kiểm tra phần tử Disable =========");

        WebElement PasswordTextbox = driver.findElement(By.cssSelector("input#disable_password"));
        if(PasswordTextbox.isEnabled()){
            System.out.println("Password Textbox is enable");
        }else{
            System.out.println("Password Textbox is not enable");
        }

        WebElement AgeRadioDisable = driver.findElement(By.cssSelector("input#radio-disabled"));
        if(AgeRadioDisable.isEnabled()){
            System.out.println("Age Radio is enable");
        }else{
            System.out.println("Age Radio is not enable");
        }

        WebElement BiographyTextarea = driver.findElement(By.cssSelector("textarea#bio"));
        if (BiographyTextarea.isEnabled()){
            System.out.println("Biography Textarea is enable");
        }else{
            System.out.println("Biography Textarea is not enable");
        }

        WebElement JobRole3Dropdown = driver.findElement(By.cssSelector("select#job3"));
        if(JobRole3Dropdown.isEnabled()){
            System.out.println("Job Role3 Dropdown is enable");
        }else{
            System.out.println("Job Role3 Dropdown is not enable");
        }

        WebElement InterestsCheckboxD = driver.findElement(By.cssSelector("input#check-disbaled"));
        if(InterestsCheckboxD.isEnabled()){
            System.out.println("Interests Checkbox is enable");
        }else{
            System.out.println("Interests Checkbox is not enable");
        }

        WebElement Slider02D = driver.findElement(By.cssSelector("input#slider-2"));
        if(Slider02D.isEnabled()){
            System.out.println("Slider02 is enable");
        }else{
            System.out.println("Slider02 is not enable");
        }
        Thread.sleep(3000);

    }
    @Test
    public void TC_03_IsSelected() {
        // IsSelected: Kiểm tra 1 element được chọn thành công (Radio/ Checkbox/ Dropdown)
        driver.get("https://automationfc.github.io/basic-form/index.html");

       WebElement AgeUnder18Radio = driver.findElement(By.cssSelector("input#under_18"));
       if(AgeUnder18Radio.isSelected()){
           System.out.println("Age Under 18 Radio is selected");
       }else{
           System.out.println("Age Under 18 Radio is de-selected");
       }

       WebElement LangJCheckbox = driver.findElement(By.cssSelector("input#java"));
       if(LangJCheckbox.isSelected()){
           System.out.println("Language Java Checkbox is selected");
       }else{
           System.out.println("Language Java Checkbox is de-selected");
       }

        AgeUnder18Radio.click();
        LangJCheckbox.click();
        System.out.println("=======Check=====");
       if (AgeUnder18Radio.isSelected()){
           System.out.println("Age Under 18 Radio is selected");
       }else {
           System.out.println("Age Under 18 Radio is de-selected");
       }

       if(LangJCheckbox.isSelected()){
           System.out.println("Language Java Checkbox is selected");
       }else{
           System.out.println("Language Java Checkbox is de-selected");
       }
    }
    @Test
    public void TC_04_MailChimp() throws InterruptedException {
        driver.get("https://login.mailchimp.com/signup/");

        driver.findElement(By.cssSelector("input#email")).sendKeys("vuthithieulinhhhh@gmail.com");
        driver.findElement(By.cssSelector("input#email")).sendKeys(Keys.TAB);
//        driver.findElement(By.cssSelector("button#create-account-enabled")).click();
        Thread.sleep(3000);

        // Bỏ trống
        Assert.assertTrue(driver.findElement(By.cssSelector("li.lowercase-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.uppercase-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.number-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.special-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//li[@class='8-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.username-check.not-completed")).isDisplayed());


        //Nhập 1 ký tự chữ thường không trùng tên username (One lowercase character)
        driver.findElement(By.cssSelector("input#new_password")).sendKeys("auto");
        driver.findElement(By.cssSelector("input#new_password")).sendKeys(Keys.TAB);
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.cssSelector("li.lowercase-char.completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.uppercase-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.number-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.special-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//li[@class='8-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.username-check.completed")).isDisplayed());

        //Nhập 1 ký tự chữ thường trùng tên username (One lowercase character)
        driver.findElement(By.cssSelector("input#new_password")).clear();
        driver.findElement(By.cssSelector("input#new_password")).sendKeys("vuthi");
        driver.findElement(By.cssSelector("input#new_password")).sendKeys(Keys.TAB);
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.cssSelector("li.lowercase-char.completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.uppercase-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.number-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.special-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//li[@class='8-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.username-check.not-completed")).isDisplayed());

        //Nhập 1 ký tự chữ hoa không trùng tên username (One uppercase character)
        driver.findElement(By.cssSelector("input#new_password")).clear();
        driver.findElement(By.cssSelector("input#new_password")).sendKeys("A");
        driver.findElement(By.cssSelector("input#new_password")).sendKeys(Keys.TAB);
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.cssSelector("li.lowercase-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.uppercase-char.completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.number-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.special-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//li[@class='8-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.username-check.completed")).isDisplayed());

        //Nhập 1 ký tự chữ hoa trùng tên username (One uppercase character)
        driver.findElement(By.cssSelector("input#new_password")).clear();
        driver.findElement(By.cssSelector("input#new_password")).sendKeys("V");
        driver.findElement(By.cssSelector("input#new_password")).sendKeys(Keys.TAB);
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.cssSelector("li.lowercase-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.uppercase-char.completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.number-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.special-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//li[@class='8-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.username-check.not-completed")).isDisplayed());

        //Nhập 1 ký tự số (One number)
        driver.findElement(By.cssSelector("input#new_password")).clear();
        driver.findElement(By.cssSelector("input#new_password")).sendKeys("1");
        driver.findElement(By.cssSelector("input#new_password")).sendKeys(Keys.TAB);
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.cssSelector("li.lowercase-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.uppercase-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.number-char.completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.special-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//li[@class='8-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.username-check.completed")).isDisplayed());

        //Nhập 1 ký tự đặc biệt (One special character)
        driver.findElement(By.cssSelector("input#new_password")).clear();
        driver.findElement(By.cssSelector("input#new_password")).sendKeys("@");
        driver.findElement(By.cssSelector("input#new_password")).sendKeys(Keys.TAB);
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.cssSelector("li.lowercase-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.uppercase-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.number-char.not-completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.special-char.completed")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//li[@class='8-char not-completed']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("li.username-check.completed")).isDisplayed());

        //Nhập full
        driver.findElement(By.cssSelector("input#new_password")).clear();
        driver.findElement(By.cssSelector("input#new_password")).sendKeys("Testing123@");
        driver.findElement(By.cssSelector("input#new_password")).sendKeys(Keys.TAB);
        Thread.sleep(3000);

        Assert.assertFalse(driver.findElement(By.cssSelector("li.lowercase-char.completed")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.cssSelector("li.uppercase-char.completed")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.cssSelector("li.number-char.completed")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.cssSelector("li.special-char.completed")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.xpath("//li[@class='8-char completed']")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.cssSelector("li.username-check.completed")).isDisplayed());
        Thread.sleep(3000);

    }

    @AfterClass
    public void AfterClass() {
        //driver.quit();
    }
}
