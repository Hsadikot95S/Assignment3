package Testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ Count_Word.class, Divide.class, SquareTest.class })
public class AllTests {

}
