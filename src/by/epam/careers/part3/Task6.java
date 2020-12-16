package by.epam.careers.part3;

import java.util.Arrays;

/**Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
 * его по возрастанию. Делается это следующим образом: сравниваются два
 * соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются на один
 * элемент вперёд. Если ai > ai+1, то производится перестановка и
 * сдвигаются на один элемент назад. Составить алгоритм этой сортировки.*/
public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            for (int i = 0; i < arr.length; i++) {
                for (int a = 0; a < arr.length - 1; ) {
                    if (arr[a] <= arr[a + 1]) {
                        a++;
                        continue;
                    }
                    if (arr[a] > arr[a + 1]) {
                        int x = arr[a];
                        arr[a] = arr[a + 1];
                        arr[a + 1] = x;
                        if(a != 0) { a--; }
                    }
                }
            }
        System.out.println(Arrays.toString(arr));
    }
}
