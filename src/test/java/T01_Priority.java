import org.testng.annotations.Test;

public class T01_Priority {

    @Test (priority = 1, groups = {"sanityWelcomeModule"})
    public void test_priority1(){
        System.out.println("TestNG Priority test_priority1");
    }

    @Test (priority = 2)
    public void test_priority2(){
        System.out.println("TestNG Priority test_priority2");
    }

    @Test (priority = 3)
    public void test_priority3(){
        System.out.println("TestNG Priority test_priority3");
    }

    //priority = default 0. This is printed first
    @Test
    public void test_priority0(){
        System.out.println("TestNG Priority test_priority0");
    }

}
