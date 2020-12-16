package by.epam.careers.part2;

import static java.lang.Math.random;

/**Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.*/
public class Task13 {
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
                    if (arr[j][i] > arr[j + 1][i]) {
                        int x = arr[j][i];
                        arr[j][i] = arr[j + 1][i];
                        arr[j + 1][i] = x;
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
