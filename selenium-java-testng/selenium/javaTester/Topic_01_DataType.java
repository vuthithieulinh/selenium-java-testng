package javaTester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class Topic_01_DataType {
    //Kiểu dữ liệu nguyên thủy (Primitive Type
    // Kiểu ký tự
    char c = 'B';
    // Kiểu số nguyên
    byte bNumber = 127;
    short sNumber = 32767;
    int iNumber = 70000;
    long lNumber = 1000000;
    //Kiểu số thực
    float fNumber = 10.5f;
    double dNumber = 10.5d;
    //Kiểu logic
    boolean test = true;

    // Kiểu dữ liệu tham chiếu (Reference Type)
    //Kiểu mảng (Array)
    String[] studentName = {"Nguyễn Văn A", "Nguyễn Thị B"};
    int[] studentAge = {30,35};
    //Kiểu Object
    Object studentAddres ="Hoàng Mai - Hà Nội";
    //Kiểu chuỗi (String)
    String name ="Linh";
    String sID = "123";

    //Clas.Interface/Collection
    //Class
    FirefoxDriver ffDriver = new FirefoxDriver();
    // public class FirefoxDriver
    // Interface
    WebDriver driver = new ChromeDriver();
    //public interface WebDriver

    List<WebElement> textboxes = driver.findElements(By.cssSelector(""));
    //Collection
    ArrayList<String> studentCity = new ArrayList<String>();
}
