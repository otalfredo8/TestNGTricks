import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.Assert;

@Listeners(T11_a_IInvokedMethodListener.class)
public class T11_b_IInvokedMethodListener {

    @BeforeClass
    public void setUp() {
        System.out.println("-Code in @BeforeClass setUp()");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("-Code in @AfterClass cleanUp()");
    }

    @Test
    public void testMethod1() {
        System.out.println("-Code in testMethod1");
        //Assert.fail();
    }

    @Test
    public void testMethod2() {
        System.out.println("-Code in testMethod2");
    }
}
