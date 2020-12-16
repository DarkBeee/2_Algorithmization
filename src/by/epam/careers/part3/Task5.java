package by.epam.careers.part3;

import java.util.Arrays;

/**Сортировка вставками. Дана последовательность чисел  a1,a2,...,an .Требуется
 * переставить числа в порядке возрастания. Делается  это  следующим  образом.
 * Пусть  a1,a2,...,ai   -  упорядоченная  последовательность,  т.  е. a1 <= a2 <=...<=an.
 * Берется  следующее  число  ai+1   и  вставляется  в  последовательность  так,
 * чтобы  новая последовательность была тоже возрастающей. Процесс производится до
 * тех пор, пока все элементы от i + 1 до n не будут перебраны. Примечание.
 * Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.*/
public class Task5 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int left = 1; left < arr.length; left++) {
            int index = binarySearch(arr, left);
            int value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (arr[i] > value) {
                    arr[i + 1] = arr[i];
                } else break;
            }
            arr[index] = value;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int binarySearch(int[] arr, int i) {
        int left = 0;
        int key = arr[i];
        int right = i;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (key == arr[middle]) {
                return middle;
            }
            if (key > arr[middle]) {
                left = middle + 1;
            }
            if (key < arr[middle]) {
                right = middle - 1;
            }
        }
        return left;
    }
}
