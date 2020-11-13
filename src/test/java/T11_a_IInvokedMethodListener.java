import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class T11_a_IInvokedMethodListener implements IInvokedMethodListener {

    public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext testContext) {
        // Before every method in the Test Class
        System.out.println("beforeInvocation: runs before every method in the Test Class");
        System.out.println(method.getTestMethod().getMethodName());
        System.out.println(testContext.getName());

    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        // After every method in the Test Class
        System.out.println("afterInvocation: runs after every method in the Test Class");
        System.out.println(testResult.isSuccess());
    }
}
