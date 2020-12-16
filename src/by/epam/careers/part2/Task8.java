package by.epam.careers.part2;

import static java.lang.Math.*;
import java.io.*;


/**В числовой матрице поменять местами два столбца любых столбца,
 т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
 а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.*/
public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine()); // размер матрицы
        int first = Integer.parseInt(reader.readLine()); // номер столбца
        int second = Integer.parseInt(reader.readLine()); // номер столбца
        int[][] arr = new int[N][N];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (random() * 100);
            }
        }
        for(int i = 0; i < arr.length; i++) {  // до замены
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = first; i < first + 1; i++) {
            for(int j = 0; j < arr.length; j++) {
                int x = arr[j][i];
                arr[j][i] = arr[j][second];
                arr[j][second] = x;
            }
        }
        for(int i = 0; i < arr.length; i++) {  // после замены
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
