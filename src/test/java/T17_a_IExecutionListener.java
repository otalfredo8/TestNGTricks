import org.testng.IExecutionListener;

public class T17_a_IExecutionListener implements IExecutionListener {

    private long startTime;

    @Override
    public void onExecutionStart() {
        startTime = System.currentTimeMillis();
        System.out.println("TestNG is going to start. Let's start the tomcat...");

        System.out.println("Notify using JMS that TestNG is going to start");
    }

    @Override
    public void onExecutionFinish() {
        System.out.println("TestNG has finished, took around " + (System.currentTimeMillis() - startTime) + "ms, shutdown the server");

        System.out.println("Notify using JMS, TestNG is finished");
    }
}
