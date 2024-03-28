package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ MatrixSumsTest.class, MatrixTest.class })
public class AllTests {

}
