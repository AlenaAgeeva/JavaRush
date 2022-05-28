package math;

import org.junit.Assert;
import org.junit.Test;

public class AbsTest {

    @Test
    public void whenFirstClosestToNum() {
        int num = 10;
        int first = 20;
        int second = 45;
        Assert.assertEquals(Abs.displayClosestToNum(num, first, second), first);
    }

    @Test
    public void whenSecondClosestToNum() {
        int num = -10;
        int first = 20;
        int second = -5;
        Assert.assertEquals(Abs.displayClosestToNum(num, first, second), second);
    }

    @Test
    public void whenBothClosestToNum() {
        int num = -10;
        int first = 20;
        int second = 20;
        Assert.assertEquals(Abs.displayClosestToNum(num, first, second), first);
    }
}