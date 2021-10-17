package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    public void
    return_0_when_input_is_empty() {
        assertEquals("0", given(""));
    }

    @Test
    public void
    return_3_when_input_is_1_2() {
        assertEquals("3", given("1,2"));
    }

}
