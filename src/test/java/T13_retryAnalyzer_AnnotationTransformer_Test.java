import org.testng.Assert;
import org.testng.annotations.Test;

public class T13_retryAnalyzer_AnnotationTransformer_Test {

//    @Test (retryAnalyzer = T12_a_RetryAnalyzer.class)  //deprecated by IAnnotationTransformer
    @Test
    public void tes_retry1(){
        Assert.assertEquals(true, false);
        System.out.println("tes_retry1");
    }

//    @Test (retryAnalyzer = T12_a_RetryAnalyzer.class) //deprecated by IAnnotationTransformer
    @Test
    public void test_retry2(){
        Assert.assertEquals(true, true);
        System.out.println("test_retry2");
    }
}
