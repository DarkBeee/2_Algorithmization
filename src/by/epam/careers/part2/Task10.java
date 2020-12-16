package by.epam.careers.part2;

import static java.lang.Math.*;
import java.io.*;

/**Найти положительные элементы главной диагонали квадратной матрицы.*/
public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine()); // размер матрицы
        int[][] arr = new int[N][N];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (random() * 100 - 50);
            }
        }
        System.out.println("Положительные элементы главной диагонали");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][i] > 0) {
                System.out.print(arr[i][i] + " ");
            }
        }
    }
}
