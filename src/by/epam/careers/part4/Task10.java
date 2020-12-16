package by.epam.careers.part4;

import java.util.Arrays;

/**Дано натуральное число N. Написать метод(методы) для формирования
 * массива, элементами которого являются цифры числа N.*/
public class Task10 {
    public static void main(String[] args) {
        int number = 8561634;
        int[] arr = createArray(number);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] createArray(int number) {
        int[] arr = new int[Integer.toString(number).length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number % 10;
            number = number / 10;
        }
        return arr;
    }
}
