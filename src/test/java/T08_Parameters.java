import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class T08_Parameters {

    @Test
    @Parameters({"str1", "str2"})
    public void test_parameters(String str1, String str2) {

        if (str1.equalsIgnoreCase(str2))
            System.out.println("First parameter is equalsIgnoreCase to Second parameter");
    }


}
