package syntax;

import org.junit.Test;
import math_functions.MinOfThree;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinOfThreeTest {
    @Test
    public void whenSecondIsLess() {
        assertThat(MinOfThree.min(10, 2, 5), is(2));
    }

    @Test
    public void whenFirstIsLess() {
        assertThat(MinOfThree.min(-10, 0, 5), is(-10));
    }

    @Test
    public void whenThirdIsLess() {
        assertThat(MinOfThree.min(-10, -10, 5), is(-10));
    }

}