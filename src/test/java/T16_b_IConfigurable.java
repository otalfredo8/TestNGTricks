import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//No testng xml file
@Listeners({T16_a_IConfigurable.class, T14_a_ISuiteListener.class})
public class T16_b_IConfigurable {
    
    @BeforeSuite
    public void beforeS (){
        System.out.println("Before suite step");
    }

    @Test
    public void te(){
        System.out.println("steps at @Test");
    }
}
