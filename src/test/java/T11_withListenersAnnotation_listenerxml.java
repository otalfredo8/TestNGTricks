import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(T10_TestListener.class)
public class T11_withListenersAnnotation_listenerxml {

    @Test
    public void testWithListeners(){
        System.out.println("My testWithListeners");
        Assert.assertEquals(true, false);
    }
}
