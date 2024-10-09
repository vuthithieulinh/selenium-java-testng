package testng;

import org.testng.Assert;

public class Topic_01_Assertion {
    public static void main(String[] args) {
        // 3 hàm chính để kiểm tra tính đúng đắn của dữ liệu
        boolean gender = 3 > 5;

        // Kiểm tra dữ liệu nó phải ĐÚNG thì mới ĐÚNG
        Assert.assertTrue(gender);

        // Kiểm tra dữ liệu nó phải SAI thì mới ĐÚNG
        Assert.assertFalse(gender);

        // Kiểm tra dữ liệu nó bằng với mong muốn không (ACTUAL - EXPECTED)
        // Liểu dữ liệu phai giống nhau
        // Giá trị của dữ liệu bằng nhau
        Assert.assertEquals(false,false);
    }
}
