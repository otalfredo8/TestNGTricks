import org.testng.Assert;
import org.testng.ISuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T13_b_IAnnotationTransformer {
    private static int counter = 0;

    @Test
    public void IAnnotationTester(){
        counter++;
        if(counter <= 2){

            System.out.println("Failing IAnnotationsTester purposefully");
            Assert.fail("Failing IAnnotation");
        }
        System.out.println("Test passed");
    }
}
