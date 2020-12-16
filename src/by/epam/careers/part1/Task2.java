package by.epam.careers.part1;

import java.io.*;

/**Дана последовательность дествительных чисел a1, a2,..., an.
 Заменить все её члены больше данного Z, этим числом. Подсчитать количество замен.*/
public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[100];
        int Z = Integer.parseInt(reader.readLine());
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if(arr[i] > Z) {
                arr[i] = Z;
                count++;
            }
        }
        System.out.println("Количество замен: " + count);
        //System.out.println(Arrays.toString(arr));
    }
}
