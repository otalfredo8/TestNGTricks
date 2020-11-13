import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class T13_a_IAnnotationTransformer implements IAnnotationTransformer {

    public void transform(ITestAnnotation iTestAnnotation, Class testClass, Constructor testConstructor, Method testMethod){
        iTestAnnotation.setRetryAnalyzer(T12_a_IRetryAnalyzer.class);
    }
}
