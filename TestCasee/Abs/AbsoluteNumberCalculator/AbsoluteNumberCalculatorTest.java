import junit.framework.TestCase;
import org.junit.Test;

public class AbsoluteNumberCalculatorTest extends TestCase {
    @Test
    public void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
    }
    @Test
    public void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
    }
    @Test
    public void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
    }
}