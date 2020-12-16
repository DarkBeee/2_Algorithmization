package by.epam.careers.part4;

import java.util.Arrays;

/**Составить программу, которая в массиве A[N] находит второе по
 * величине число (вывести на печать число, которое меньше
 * максимального элемента массива, но больше всех других элементов).*/
public class Task5 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 8, 9, 10, 10};
        Arrays.sort(arr);
        int secmax = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                secmax = arr[i - 1];
                break;
            }
        }
        System.out.println("Второе по величине число: " + secmax);
        if (secmax == 0) {
            System.out.println("Все числа равны");
        }
    }
}
