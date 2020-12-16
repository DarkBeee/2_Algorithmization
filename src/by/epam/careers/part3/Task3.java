package by.epam.careers.part3;

import java.util.*;

/**Сортировка выбором. Дана последовательность чисел a1 <= a2 <=...<= an.
 * Требуется переставить элементы так, чтобы они были расположены по убыванию.
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставитя на
 * первое место, а первый - на место наибольшего. Затем, начиная со второго,
 * эта процедура повторяется. Написать алгоритм сортировки выбором.*/
public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int index = 0; index < arr.length; index++) {
            int max = index;
            for (int i = index; i < arr.length; i++) {
                if (arr[i] > arr[max]) {
                    max = i;
                }
            }
            int x = arr[max];
            arr[max] = arr[index];
            arr[index] = x;
        }
        System.out.println(Arrays.toString(arr));
    }
}
