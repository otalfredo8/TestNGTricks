import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

@Listeners(T11_a_IInvokedMethodListener.class)
public class T11_b_IInvokedMethodListener {

    @BeforeClass
    public void setUp() {
        System.out.println("Code in before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("Code in after class");
    }

    @Test
    public void testMethod1() {
        System.out.println("Code in testMethod1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Code in testMethod2");
    }
}
