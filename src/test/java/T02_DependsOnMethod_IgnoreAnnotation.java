import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public class T02_DependsOnMethod_IgnoreAnnotation {

    @Test(dependsOnMethods = "test_two")
    public void test_one(){
        System.out.println("TestNG dependsOnMethods test_one");
    }
    @Test
    public void test_two() throws InterruptedException {
        System.out.println("TestNG dependsOnMethods test_two");
        Thread.sleep(2000);
    }
//    @Ignore
    @Test
    public void test_three(){
        System.out.println("TestNG dependsOnMethods test_three");
    }
}
