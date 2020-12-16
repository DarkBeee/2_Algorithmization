package by.epam.careers.part2;

import java.io.*;

/**Сформировать квадратную матрицу порядка n по заданному образцу(n-четное):*/
public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++) {
            if(arr.length / 2 > i) {
                for(int j = i; j < arr.length - i; j++) {
                    arr[i][j] = 1;
                }
            } else {
                for(int j = arr.length - i - 1; j <= i; j++) {
                    arr[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

