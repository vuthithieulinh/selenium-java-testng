package javaTester;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic_04_And_Or {

    @Test
    public void TC_01_Verify() {
        String contactInformation = "Linh Vu\nvuthithieulinh2@gmail.com";
//        Assert.assertTrue(contactInformation.contains("Linh Vu"));
//        Assert.assertTrue(contactInformation.contains("vuthithieulinh2@gmail.com"));

        Assert.assertTrue(contactInformation.contains("Linh Vu") && contactInformation.contains("vuthithieulinh2@gmail.com"));
    }
}
