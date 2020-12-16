package by.epam.careers.part1;

import static java.lang.Math.*;
import java.util.*;

/**В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 Если таких чисел несколько, то определить наименьшее из них.*/
public class Task9 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int count = 0;
        int maxLength = 0;
        int value = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (random() * 100);
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]){
                count = 1;
                while(i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                    count++;
                }
                if(count > maxLength) {
                    maxLength = count;
                    value = arr[i];
                }
            }
        }
        if(maxLength == 0) {
            System.out.println("Повторяющиеся числа отсутствуют.");
        } else {
            System.out.println("Число " +  value + " повторяется " + maxLength + " раз.");
        }
        System.out.println(Arrays.toString(arr));
    }
}