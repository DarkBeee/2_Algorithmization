package by.epam.careers.part2;

import java.io.IOException;
import java.io.*;

/**Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 причём в каждом столбце число единиц равно номеру столбца.*/
public class Task14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                arr[i][j] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
