package by.epam.careers.part3;

import java.util.Arrays;

/**Сортировка обменами. Дана последовательность чисел a1 <= a2 <=...<= an. Требуется
 * переставить числа в порядке возрастания. Для этого сравниваются два соседних числа
 * ai и ai+1. Если ai > ai+1, то делается перестановка. Так продолжается
 * до тех пор, пока все элементы не станут раположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок. */
public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int count = 0;
        for (int index = 0; index < arr.length; index++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                    count++;
                }
            }
        }
        System.out.println("Количество перестановок: " + count);
        System.out.println(Arrays.toString(arr));
    }
}
