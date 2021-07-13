package ryzhenko;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class Tests {

    private int number;

    @Test
    void testRandomNumber() {
        number = (int) (Math.random() * 2000 - 1000);
    }

    @Test
    void testNull() {
        number = 0;
    }

    @Test
    void testAnotherNumber() {
        number = -999999999;
    }

    @AfterEach
    void printResults() {
        System.out.println("Число: " + number);
        System.out.println("Сумма его цифр: " + Task2.findSumOfNumbers(number));
    }
}