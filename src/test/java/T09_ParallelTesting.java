import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import static org.junit.Assert.assertNotNull;

public class T09_ParallelTesting {

    @Test
    public void test_parallelTest1_docs(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
        driver.get("https://www.google.com/search?q=google+docs&rlz=1C1CHBF_enUS897US897&oq=google+docs&aqs=chrome.0.69i59l2j69i64j69i60l3j69i65l2.1918j0j7&sourceid=chrome&ie=UTF-8");
        System.out.println("test_parallelTest1" + " Headless Chrome " + "docs");
    }

    @Test
    public void test_parallelTest2_maps(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
        driver.get("https://www.google.com/search?rlz=1C1CHBF_enUS897US897&sxsrf=ALeKk03xWNCak3-b20B5PPonPl-fanoM1A%3A1589465205310&ei=dVC9XvrBEtWrytMPjp60kAI&q=google+maps&oq=google+maps&gs_lcp=CgZwc3ktYWIQAzIECCMQJzIFCAAQkQIyAggAMgIIADICCAAyAggAMgcIABAUEIcCMgIIADICCAAyAggAOgQIABBHOgUIABCDAVC2rQFY7q8BYJ-1AWgAcAd4AIABYIgBnQKSAQE0mAEAoAEBqgEHZ3dzLXdpeg&sclient=psy-ab&ved=0ahUKEwi60Menw7PpAhXVlXIEHQ4PDSIQ4dUDCAw&uact=5");
        System.out.println("test_parallelTest2" + "Headless Firefox" + "maps");
    }

    @Test
    public void test_parallelTest3_books(){
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        assertNotNull(driver);
        driver.get("https://www.google.com/");
        System.out.println("test_parallelTest3" + "Internet Explorer" + "books");
    }

    @Test
    public void test_parallelTest4_news(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/search?rlz=1C1CHBF_enUS897US897&sxsrf=ALeKk03cl_FhyJHmwjZ3pvbH0k6vvwpMrg%3A1589465260451&ei=rFC9Xo6RG8XCytMPyryJ2Aw&q=google+news&oq=google+news&gs_lcp=CgZwc3ktYWIQAzIICAAQgwEQkQIyBQgAEIMBMgUIABCDATICCAAyAggAMgIIADICCAAyBQgAEIMBMgIIADICCAA6BAgAEEc6BQgAEJECOgcIABAUEIcCUIbIBlizywZghM4GaABwBHgAgAFtiAGIApIBAzMuMZgBAKABAaoBB2d3cy13aXo&sclient=psy-ab&ved=0ahUKEwiOl-3Bw7PpAhVFoXIEHUpeAssQ4dUDCAw&uact=5");
        System.out.println("test_parallelTest4" + " Firefox " + "news");
    }
}
