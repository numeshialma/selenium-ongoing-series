package Session_46_TestNG_Listeners_Extent_Report_Generation.task_02;

import Session_46_TestNG_Listeners_Extent_Report_Generation.task_01.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

    public void onStart (ITestContext context) {
        System.out.println("Test execution is started......");
    }

    public void onTestStart(ITestResult result){
        System.out.println("test started......");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("test passed......");
    }
    public void onTestFailure(ITestResult result) {
        System.out.println("test failed......");
    }

    public void onTestSkipped(ITestResult result){
        System.out.println("test skipped......");
    }

    public void onFinish (ITestContext context) {
        // not implemented
    }
}
