package by.epam.careers.part2;

import static java.lang.Math.*;
import java.io.*;

/**Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine()); // номер строки
        int n = Integer.parseInt(reader.readLine()); // номер столбца
        int[][] arr = new int[20][20];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (random() * 100);
            }
        }
        for(int i = k; i == k; i++) { // вывод строки
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(int j = n; j == n; j++) { // вывод столбца
            for(int i = 0; i < arr.length; i++) {
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}
