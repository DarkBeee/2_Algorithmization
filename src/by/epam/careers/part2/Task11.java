package by.epam.careers.part2;

import static java.lang.Math.*;

/**Матрицу 10x20 заполнить случайными числами от 0 до 15.
 Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.*/
public class Task11 {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (random() * 16);
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Число 5 встречается 3 и более раз в следующих строках: ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 5) {
                    count++;
                }
            }
            if(count >= 3) {
                System.out.print((i + 1) + " ");
            }
            count = 0;
        }
    }
}
