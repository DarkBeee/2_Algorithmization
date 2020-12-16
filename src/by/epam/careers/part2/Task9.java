package by.epam.careers.part2;

import static java.lang.Math.*;

import java.io.*;

/**Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
 Определить, какой столбец содержит максимальную сумму.*/
public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine()); // размер матрицы
        int[][] arr = new int[N][N];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (random() * 100);
            }
        }
        int[] sum = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                sum[i] += arr[j][i];
            }
        }
        int max = 0;
        int number = 0;
        for(int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
            if(sum[i] > max) {
                max = sum[i];
                number = i;
            }
        }
        System.out.println();
        System.out.println("Наибольшая сумма у столбца № " + (number + 1) + ": " + max);
    }
}
