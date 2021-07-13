package ryzhenko;

public class Task2 {

    /**
     * Метод нахождения суммы цифр целого числа
     *
     * @param num - Целое число
     * @return Сумма его цифр
     */
    public static int findSumOfNumbers(int num) {

        if (num < 0) {
            num *= -1;
        }
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}