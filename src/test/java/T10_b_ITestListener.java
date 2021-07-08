import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(T10_a_ITestListener.class)
public class T10_b_ITestListener {

    @Test
    public void testWithListeners(){
        System.out.println("My testWithListeners");
        //Assert.fail();
        Assert.assertTrue(true);
    }
}
