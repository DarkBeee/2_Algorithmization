package by.epam.careers.part2;

import static java.lang.Math.*;

/**Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.*/
public class Task1 {
    public static void main(String[] args) {
        int[][] arr = new int[20][20];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (random() * 100);
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j += 2) {
                if(arr[0][j] > arr[arr.length - 1][j]) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println(); //перенос строки для сохранения табличной формы
        }
    }
}
