import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class T18_a_Factory {

    @Factory(dataProvider = "credentials")
    public Object[] createInstances(String user, String password) {
        Object [] tests = new Object[1];
        tests[0] = new T18_b_Factory(user, password);

        return tests;
    }

    @DataProvider(name = "credentials")
    public Object[][] credentialsObject() {
        Object[][] credentials = new String[3][2];
        credentials[0][0] = "user1";
        credentials[1][0] = "user2";
        credentials[2][0] = "user3";
        credentials[0][1] = "pass1";
        credentials[1][1] = "pass2";
        credentials[2][1] = "pass3";
        return credentials;
    }



}
