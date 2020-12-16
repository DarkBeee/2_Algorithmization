package by.epam.careers.part1;

import static java.lang.Math.*;
import java.io.*;

/**Даны целые числа a1, a2, ..., an. Вывести на печать только те числа, для которых ai > i.*/
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[100];
        int i = Integer.parseInt(reader.readLine());
        for(int j = 0; j < arr.length; j++) {
            arr[j] = (int) (random() * 100 - 50);
            if(arr[j] > i) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
