import org.testng.annotations.Test;

@Test (groups = "classLevelAnnotation", invocationCount = 2)
public class T20_ClassLevelAnnotations {

    @Test (description = "this method has independent options from the class level")
    public void testOne(){
        System.out.println("@Test at method level");
    }

    public void testTwo(){
        System.out.println("@Test at class level");
    }
}
