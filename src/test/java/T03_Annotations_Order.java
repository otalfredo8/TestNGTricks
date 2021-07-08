import org.testng.annotations.*;

public class T03_Annotations_Order {

    //To control test execution on sanity.xml file
    @BeforeSuite
    public void testBeforeSuite(){
        System.out.println("testBeforeSuite");
    }
    @BeforeTest
    public void testBeforeTest(){
        System.out.println("testBeforeTest");
    }
    @BeforeClass
    public void testBeforeClass(){ System.out.println("testBeforeClass"); }
    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("testBeforeMethod");
    }
    @Test
    public void test(){
        System.out.println("test");
    }
    @AfterMethod
    public void testAfterMethod(){
        System.out.println("testAfterMethod");
    }
    @AfterClass
    public void testAfterClass(){
        System.out.println("testAfterClass");
    }
    @AfterTest
    public void testAfterTest(){
        System.out.println("testAfterTest");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite");
    }
}
