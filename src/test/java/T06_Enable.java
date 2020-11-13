import org.testng.annotations.Test;

public class T06_Enable {

    @Test
    public void test_Enable(){
        System.out.println("test by default is enabled");
    }
    @Test (enabled = false)
    public void test_NoEnable(){
        System.out.println("test is not enabled");
    }
}
