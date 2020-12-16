package by.epam.careers.part2;

import static java.lang.Math.random;

/**Найдите наибольший элемент матрицы и заменить все нечётные элементы на него*/
public class Task15 {
    public static void main(String[] args) {
        int[][] arr = new int[20][20];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (random() * 1000);
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        } System.out.println("Наибольшее число матрицы: " + max);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] % 2 != 0) {
                    arr[i][j] = max;
                }
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

