package by.epam.careers.part3;

import static java.lang.Math.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 * Объединить их в один массив, включив второй массив меджу k-м и (k+1) - м элементами
 * первого, при этом не используя дополнительный массив.*/
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        int[] arr = new int[5];
        int[] forcopy = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (random() * 50);
        }
        for(int i = 0; i < forcopy.length; i++) {
            forcopy[i] = (int) (random() * 50);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(forcopy));
        System.arraycopy(arr, 0, forcopy, k, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(forcopy));
    }
}
