package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ MatrixSumsTest.class, MatrixTest.class, VectorOperatorTest.class, MatrixDisplayTest.class })
public class AllTests {

}
