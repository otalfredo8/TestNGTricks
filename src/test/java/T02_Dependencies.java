import org.junit.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public class T02_Dependencies {

    @Test(dependsOnMethods = "test_two")
    public void test_one(){
        System.out.println("TestNG dependsOnMethods test_one");
    }

    @Test
    public void test_two() throws InterruptedException {
        System.out.println("TestNG dependsOnMethods test_two");
        //Thread.sleep(2000);
    }

    @Ignore
    @Test
    public void test_three(){
        System.out.println("TestNG dependsOnMethods test_three");
    }

    //TestNG Dependency extended (see t02Dependency.xml)
    @Test (groups = "dependency3")
    public void dependencyTest3(){
        System.out.println("This dependencyTest3() is part of 'dependency' group");
    }

    @Test (groups = {"dependency2"})
    public void dependencyTest2(){
        System.out.println("This dependencyTest2() is part of 'dependency' group");
    }

    //@Test(groups = {"otherGroup"}, dependsOnGroups = {"dep.*"} )
    @Test(groups = {"otherGroup"})
    public void dependencyTest1(){
        System.out.println("This method depends on any group matching the regular expression dep.*");
    }
}
