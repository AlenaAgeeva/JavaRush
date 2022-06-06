package scanner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void whenFactorialIs720() {
        assertEquals(new Factorial().count(6)
                .intValueExact(), 720);
    }

    @Test
    public void whenFactorialIs2432902008176640000() {
        assertEquals(new Factorial().count(20)
                .longValueExact(), 2432902008176640000L);
    }
}