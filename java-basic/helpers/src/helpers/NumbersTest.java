package helpers;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @org.junit.jupiter.api.Test
    void readIntNumbers() {
        int i = Numbers.readIntNumbers();
        assertEquals(5, i);
    }



    @org.junit.jupiter.api.Test
    void isInteger() {
    }

    @org.junit.jupiter.api.Test
    void getRandomInt() {
    }
}