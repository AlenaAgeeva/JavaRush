package syntax;

import org.junit.Test;
import math_functions.Min;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MinTest {
    @Test
    public void whenSecondIsLess() {
        assertThat(Min.min(10, 5), is(5));
    }

    @Test
    public void whenFirstIsLess() {
        assertThat(Min.min(-10, 5), is(-10));
    }
}