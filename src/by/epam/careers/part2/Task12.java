package by.epam.careers.part2;

import static java.lang.Math.random;

/**Отсортировать строки матрицы по возрастанию и убыванию элементов.*/
public class Task12 {
    public static void main(String[] args) {
        int[][] arr = new int[20][20];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (random() * 100);
            }
        }
        // Циклы для сортировки по возрастанию.
        // Для сортировки по убыванию поменять знак ">" на знак "<" в 19-й строке
        for (int i = 0; i < arr.length; i++) {
            for (int f = arr[i].length - 1; f > 0; f--) {
                for (int j = 0; j < f; j++) {
                    if (arr[i][j] > arr[i][j + 1]) {
                        int x = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = x;
                    }
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
