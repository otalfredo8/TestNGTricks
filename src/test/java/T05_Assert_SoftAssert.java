import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class T05_Assert_SoftAssert {

    @Test
    public void test_Assert(){
        Assert.assertEquals(true, true);
        System.out.println("If Assert fails, scripts stops executing. This line is not printed");

    }

    @Test
    public void test_softAssert(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(true, false);
        System.out.println("Script after softAssert is still executed until facing a .assertAll()");
        softAssert.assertAll();
        System.out.println("If failing, Script after .assertAll() is not executed");
}
}
