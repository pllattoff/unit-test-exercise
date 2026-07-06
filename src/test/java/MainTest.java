import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Level 1 – Easy
    @Test
    void isPositive_shouldReturnTrue_whenCalledWith2() {
        assertTrue(Main.isPositive(2));
    }

    @Test
    void isPositive_shouldReturnFalse_whenCalledWithMinus2() {
        assertFalse(Main.isPositive(2));
    }

    @Test
    void multiply_shouldReturn20_whenCalledWith10And2() {
        //GIVEN
        int a = 10;
        int b = 2;
        int expected = 20;
        //WHEN
        int actual = Main.multiply(a, b);
        //THEN
        assertEquals(actual, expected);
    }

    @Test
    void multiply_shouldReturnMinus6_whenCalledWith3AndMinus2() {
        //GIVEN
        int a = 3;
        int b = -2;
        int expected = -6;
        //WHEN
        int actual = Main.multiply(a, b);
        //THEN
        assertEquals(actual, expected);
    }

    //Level 2 – Medium
    //1
    @Test
    void getFirstLetter_shouldReturnNull_whenCalledWithEmptyLine() {
        assertNull(Main.getFirstLetter(""));
    }

    @Test
    void getFirstLetter_shouldReturnNotNull_whenCalledWithText() {
        assertNotNull(Main.getFirstLetter("Text"));
    }

    //2
    @Test
    void divide_shouldThrowIllegalArgumentException_whenCalledWith2And0() {
        assertThrows(IllegalArgumentException.class, () -> Main.divide(2,0));
    }



    //TDD
    @Test
    void fizzBuzz_shouldReturn1_whenGiven1() {
        //GIVEN
        int n = 1;
        String expected = "1";
        //WHEN
        //THEN
        assertEquals(expected, Main.fizzBuzz(n));

    }
}