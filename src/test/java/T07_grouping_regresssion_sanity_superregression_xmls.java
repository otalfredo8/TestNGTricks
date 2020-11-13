import org.testng.annotations.Test;

//see notes in T04_xml.File for more details about grouping.
public class T07_grouping_regresssion_sanity_superregression_xmls {

//regression.xml
    @Test (groups = {"regression", "sanityWelcomeModule"})
    public void test1(){
        System.out.println("This is test 1");
    }
    @Test (groups = {"regression", "sanityWelcomeModule"})
    public void test2(){
        System.out.println("This is test 2");
    }
    @Test (groups = {"regression", "smoke", "sanityAccountRecovery"})
    public void test3(){
        System.out.println("This is test 3");
    }
    @Test (groups = {"regression", "smoke", "sanityAccountRecovery"})
    public void test4(){
        System.out.println("This is test 4");
    }
    @Test (groups = {"regression", "smoke"})
    public void test5(){
        System.out.println("This is test 5");
    }
    @Test (groups = {"regression", "smoke"})
    public void test6(){
        System.out.println("This is test 6");
    }
}
