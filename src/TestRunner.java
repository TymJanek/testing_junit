//class that runs my TestSuite

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);

        //if test(s) fails, printing why it/they failed, if they were successful printing 'Result: true'

        //false
        for(Failure fail : result.getFailures()){
            System.out.println(fail.toString());
        }

        //true
        System.out.println("Result: " + result.wasSuccessful());
    }
}

