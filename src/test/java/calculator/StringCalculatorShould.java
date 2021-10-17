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

    
    @Test
    public void
    sum_floats_and_return_float() {
        assertEquals("6.6", given("2.2,4.4"));
    }

    @Test
    public void
    treat_newLine_as_a_delimiter() {
        assertEquals("6", given("1\n2,3"));
    }

    @Test
    public void
    return_error_msg_when_newLine_at_invalid_position() {
        assertEquals("Number expected but '\n' found at position 6.", given("1,2,5,\n3"));
    }

}
