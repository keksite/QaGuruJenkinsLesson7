package tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests {


    @Test
    void upperCaseTest() {
        String name = "apple";
        String result_name = "APPLE";
        String newName = name.toUpperCase();
        assertThat(newName, equalTo(result_name));
    }

    @Test
    void powTest() {
        int a = 2;
        int b = 3;

        double result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        assertEquals(Math.pow(a, b), result);
    }
}