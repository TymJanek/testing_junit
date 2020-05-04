//class that connects classes that tests ex.1 and ex.2 into one TestSuite

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({JUnitClass.class, JUnitClass2.class})
public class TestSuite {
    //
}
