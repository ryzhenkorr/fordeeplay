package ryzhenko;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class Tests {

    private int max1;
    private int max2;
    private int max3;

    @Test
    void testTenRandomElements() {
        int[] array = new int[10];
        System.out.print("Массив из 10 случайных чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] results = Task1.findHighestValues(array);
        max1 = results[0];
        max2 = results[1];
        max3 = results[2];
    }

    @Test
    void testTenSameElements() {
        int[] array = new int[10];
        System.out.print("Массив из 10 одинаковых чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = 55;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] results = Task1.findHighestValues(array);
        max1 = results[0];
        max2 = results[1];
        max3 = results[2];
    }

    @Test
    void testTwoElements() {
        int[] array = new int[2];
        System.out.print("Массив из 2 случайных чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] results = Task1.findHighestValues(array);
        max1 = results[0];
        max2 = results[1];
        max3 = results[2];
    }

    @Test
    void testEmptyArray() {
        int[] array = new int[0];
        int[] results = Task1.findHighestValues(array);
        max1 = results[0];
        max2 = results[1];
        max3 = results[2];
    }

    @AfterEach
    void printResults() {
        if (max1 == Integer.MIN_VALUE) {
            System.out.println("Массив пуст!");
        } else {
            System.out.println("Первый максимальный элемент в массиве: " + max1);
            if (max2 == Integer.MIN_VALUE) {
                System.out.println("Второго максимального элемента нет!");
            } else {
                System.out.println("Второй максимальный элемент в массиве: " + max2);
            }
            if (max3 == Integer.MIN_VALUE) {
                System.out.println("Третьего максимального элемента нет!");
            } else {
                System.out.println("Третий максимальный элемент в массиве: " + max3);
            }
        }
    }
}