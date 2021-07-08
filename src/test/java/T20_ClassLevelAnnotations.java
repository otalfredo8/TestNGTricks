import org.testng.annotations.Test;

@Test (description = "This is a @Test at class level", invocationCount = 2)
public class T20_ClassLevelAnnotations {

    @Test (description = "Because of the @Test at method level, this method has independent options from the class level")
    public void testOne(){
        System.out.println("@Test at method level");
    }


    //this test has invocationCount = 2
    public void testTwo(){
        System.out.println("@Test at class level");
    }
}
