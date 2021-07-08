import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//No testng xml
@Listeners(T17_a_IExecutionListener.class)
public class T17_b_IExecutionListener {

    @Test
    public void someMethod(){
        System.out.print("Before this @Test Tomcat server will start and a JMS will be sent. \n");
        System.out.println("After this @Test TomCat server will stop and a JMS will be sent.");
    }

}
