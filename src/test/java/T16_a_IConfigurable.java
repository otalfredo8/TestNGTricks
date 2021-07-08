import org.testng.IConfigurable;
import org.testng.IConfigureCallBack;
import org.testng.ITestResult;

public class T16_a_IConfigurable implements IConfigurable {

    //IConfigurable listener runs after ISuiteListener, but before @BeforeSuite
    public void run(IConfigureCallBack iConfigureCallBack, ITestResult iTestResult) {
        System.out.println("Execute this before any configuration steps get executed.");
        iConfigureCallBack.runConfigurationMethod(iTestResult);
    }
    /*
    iTestResult helps to describe the result of a test
    getName()
    getMethod()
    * */
}
