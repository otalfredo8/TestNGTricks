import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class T08_Parameters_paramsxml {

    @Test
    @Parameters ({"str1", "str2"})
    public void test_parameters(String str1, String str2){
        Assert.assertTrue(str1.equalsIgnoreCase(str2));
    }
}
