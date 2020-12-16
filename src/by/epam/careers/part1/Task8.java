package by.epam.careers.part1;

import static java.lang.Math.*;
import java.util.*;

/**Дана последовательность целых чисел a1,a2,...,an. Образовать новую последовательность, выбросив из
 исходной те члены, которые равны min( a1,a2,...,an ).*/
 public class Task8 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int count = 1;
        int min = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (random() * 100);
        }
        Arrays.sort(arr);
        min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(min == arr[i]) {
                count++;
            }
        }
        int[] result = new int[arr.length - count];
        for(int i = 0; i < result.length; i++) {
            result[i] = arr[count++];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("result = " + Arrays.toString(result));
    }
 }

