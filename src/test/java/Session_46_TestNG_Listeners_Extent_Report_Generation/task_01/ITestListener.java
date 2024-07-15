package Session_46_TestNG_Listeners_Extent_Report_Generation.task_01;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

/**
 * A listener for test running
 *
 * @author
 * @author  <a href='mailooto:the_mindstorm[at]evolva[dot]ro'>Alexandru </a>
 * @author
 */
public interface ITestListener extends ITestNGListener {
    /**
     * Invoked each time before a test will be invoked. The <code> ITestResult</code> is only partially
     * filled with the references to class, method, start millis and status.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#STARTED
     */

    default void onTestStart(ITestResult result) {
        // not implemented
    }

/**
 * Invoked each time a test succeeds.
 *
 * @param result <code>ITestResult</code> containing information about the run test
 * @see ITestResult#SUCCESS
 */

    default void onTestSuccess(ITestResult result) {
        // not implemented
    }

/**
 * Invoked each time a test fails.
 *
 * @param result <code>ITestResult</code> containing information about the run test
 * @see ITestResult#FAILURE
 */


    default void onTestFailure(ITestResult result) {
        // not implemented
    }

/**
 * Invoked each time a test is skipped.
 *
 * @param result <code>ITestResult</code> containing information about the run test
 * @see ITestResult#SKIP
 */

    default void onTestSkipped(ITestResult result){
        // not implemented
    }

/**
* Invoked each time a method fails but has been annotated with success Percentage and this failure
* * still keeps it within the success percentage requested.
*@param result <code>ITestResult</code> containing information about the run test
* @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
 * **/

    default void onTestFailedButWithinSuccessPercentage (ITestResult result) {
        // not implemented
    }

/**
 * Invoked each time a test fails due to a timeout.
 * @param result <code>ITestResult</code> containing information about the run test
 **/

    default void onTestFailedWithTimeout (ITestResult result) {
        onTestFailure(result);
    }


/**
* Invoked before running all the test methods belonging to the classes inside the &lt; test&gt; * tag and calling all their Configuration methods.
*
* @param context The test context
*/

    default void onStart (ITestContext context) {
        // not implemented
    }

    /**
     * Invoked after all the test methods belonging to the classes inside the &lt; test&gt; tag have
     * run and all their Configuration methods have been called.
     *
     * @param context The test context
     */

    default void onFinish (ITestContext context) {
        // not implemented
    }
}







