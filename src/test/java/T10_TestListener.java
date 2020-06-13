import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.*;

public class T10_TestListener implements ITestListener {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        Set<String> stringSet = new HashSet<String>();

    }

    public void onTestStart(ITestResult result) {
        System.out.println("Listener" + "onTestStart");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Listener" + "onTestSuccess");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Listener" + "onTestFailure");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Listener" + "onTestSkipped");
    }

    public void onStart(ITestContext context) {
        System.out.println("Listener" + "onStart");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Listener" + "onFinish");
    }
}
