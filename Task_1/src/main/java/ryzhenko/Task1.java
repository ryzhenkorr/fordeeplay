package ryzhenko;

public class Task1 {

    /**
     * Метод нахождения трех наибольших элементов в массиве чисел
     *
     * @param array - Исходный массив чисел
     * @return Массив из трех наибольших элементов
     */
    public static int[] findHighestValues(int[] array) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = array[i];
            } else if (array[i] > max2 && array[i] != max1) {
                max3 = max2;
                max2 = array[i];
            } else if (array[i] > max3 && array[i] != max1 && array[i] != max2) {
                max3 = array[i];
            }
        }
        return new int[]{max1, max2, max3};
    }
}