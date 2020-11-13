import org.testng.ISuite;
import org.testng.ISuiteListener;

public class T14_a_ISuiteListener implements ISuiteListener {

    public void onStart(ISuite suite) {
        System.out.println("onStart ISuiteListener");
    }

    public void onFinish(ISuite suite) {
        System.out.println("onFinish ISuiteListener");
    }
}
