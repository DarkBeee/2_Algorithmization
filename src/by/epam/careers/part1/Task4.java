package by.epam.careers.part1;

import static java.lang.Math.*;
import java.util.*;

/**Даны действительные числа a1, a2,..., an. Поменять местами наибольший и наименьший элементы.*/
public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (random() * 100 - 50);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int x = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = x;
        System.out.println(Arrays.toString(arr));
    }
}
