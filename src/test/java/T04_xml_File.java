public class T04_xml_File {

    /*
    Creation:
    * Settings > Plugin > "Create TestNG XML" plugin
    * Right click on Project > Create XM file
    *
    Configuration xml file:
    * Specify the classes to run
    * Specify the methods to run (by default all @Test methods will be executed)
    *
    Report configs:
    * Eclipse reports are autogenerated
    * IntelliJ:
    *   Run/Debug Configurations > Listeners > + > EmailableReport...html, FailReport...xml
    *
    FailReport...xml:
    * After excution, if tests fail, testng_failed.xml will contain such tests
    *
    <test></test> tag
    * contains groups, classes, and methods
    *
    Enabled feature
    * false or true
    *
    Groups
    * <groups></groups>
    * <run></run>
    * <include name= "any">
    * <exclude name= "any">
    *
    Create xml file per test:
    * smokeTest, regression, integration
    *
    Parameters
    * Test level: above the <test>
    * Classes level: above the <classes>
    * Methods leve: above the <methods>
    *
    Running from CMD
    * Download testng.jar
    * Set System Variables TESTNG_HOME
    * cmd: workingDirectory>java -cp C:\...\lib\*;C:\...\bin org.testng.TestNG file.xml
    *

    *
    *
    *
    *
    **/

}