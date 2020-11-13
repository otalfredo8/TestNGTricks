import org.testng.annotations.Test;

public class T18_b_Factory {

    private String username, password;

    public T18_b_Factory(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Test (description = "login logic")
    public void loginTest1(){
        System.out.println("logic to enter username: " + username + ". Logic to enter password: " + password );
    }

    @Test
    public void loginTest2() {

        System.out.println("Script to validate free-paper agreement" + username + " : " + password);
    }
}
