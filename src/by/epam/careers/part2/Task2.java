package by.epam.careers.part2;

import static java.lang.Math.*;

/**Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/
public class Task2 {
    public static void main(String[] args) {
        int[][] arr = new int[20][20];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (random() * 100);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
    }
}
