package syntax;

import org.junit.Assert;
import org.junit.Test;

public class SumNumbersTest {

    @Test
    public void sumDigitsIs27() {
        int expected = 27;
        Assert.assertEquals(SumNumbers.sumDigitsInNumber(154566), expected);
    }
}