package javaTester;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.Random;


public class Topic_05_Random {
    //Global
    String prefixEmail = "vuthithieulinh";
    String postFixEmail = "@gmail.com";

    @Test
    public void testEmail(){
        Random rand = new Random();
        String fullEmail = prefixEmail + rand.nextInt(999) + postFixEmail;
        System.out.println(fullEmail);
    }
}
