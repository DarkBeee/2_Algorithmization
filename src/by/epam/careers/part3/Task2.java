package by.epam.careers.part3;

import java.util.*;

/**Даны две последовательности a1 <= a2 <=...<= an и b1 <= b2 <=...<= bm}.
 * Образовать из них новую последовательностьчисел так, чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать.*/
public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] forcopy = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.arraycopy(arr, 0, forcopy, 3, 5);
        System.out.println(Arrays.toString(forcopy));
        Arrays.sort(forcopy);
        System.out.println(Arrays.toString(forcopy));
    }
}
