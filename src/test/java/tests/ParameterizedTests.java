package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTests {
    @Test
    void evenNumberTest () {
        int n = Integer.parseInt(System.getProperty("num"));
        assertEquals(n % 2, 0);
    }
}
