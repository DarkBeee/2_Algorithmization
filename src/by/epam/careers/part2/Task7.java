package by.epam.careers.part2;

import static java.lang.Math.*;
import java.io.*;


/**Сформировать квадратную матрицу порядка N по правилу: A[I,J] = sin((Ie+2 - Je+2) / N)
 и подсчитать количество положительных элементов в ней.*/
public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        double[][] arr = new double[N][N];
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = sin((pow(i, 2) - pow(j, 2)) / N);
                if(arr[i][j] > 0) {
                    count++;
                }
            }
        }
        System.out.println("Количество положительных элементов: " + count);
        /*for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } */
    }
}
