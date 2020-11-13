import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class T12_a_IRetryAnalyzer implements IRetryAnalyzer {

    private int counter = 0;
    private int retryTimesLimit = 3;

    public boolean retry(ITestResult result) {
        if (counter < retryTimesLimit){
            counter++;
            return true;
        }
        return false;
    }
}
