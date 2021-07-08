import org.testng.IExecutionListener;

public class T17_a_IExecutionListener implements IExecutionListener {

    private long startTime;

    @Override
    public void onExecutionStart() {
        System.out.println("onExecutionStart() gets invoked before TestNG proceeds with invoking any other listener.");
        startTime = System.currentTimeMillis();
        System.out.println("TestNG is going to start. Let's start the tomcat...");

        System.out.println("Notify using JMS that TestNG is going to start");
    }

    @Override
    public void onExecutionFinish() {
        System.out.println("onExecutionFinish() gets invoked at the very last (after report generation phase), before TestNG exits the JVM");
        System.out.println("TestNG has finished, took around " + (System.currentTimeMillis() - startTime) + "ms, shutdown the server");

        System.out.println("Notify using JMS, TestNG is finished");
    }
}
