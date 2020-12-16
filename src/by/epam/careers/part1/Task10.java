package by.epam.careers.part1;

import static java.lang.Math.*;
import java.util.*;
import java.io.*;

/**Дан целочисленный массив с количеством элементов n. Сжать массив,
 выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 Примечание. Дополнительный массив не использовать.*/
public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (random() * 100);
        }
        for(int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
