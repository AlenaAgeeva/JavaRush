package syntax;

import org.junit.Test;
import math_functions.MinOfFour;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MinOfFourTest {

    @Test
    public void whenSecondIsLess() {
        assertThat(MinOfFour.min(10, -2, 5, -1), is(-2));
    }

    @Test
    public void whenFirstIsLess() {
        assertThat(MinOfFour.min(-10, 0, 5, 3), is(-10));
    }

    @Test
    public void whenThirdIsLess() {
        assertThat(MinOfFour.min(-10, -10, -50, 5), is(-50));
    }

    @Test
    public void whenFourthIsLess() {
        assertThat(MinOfFour.min(-10, -10, 5, -100), is(-100));
    }
}