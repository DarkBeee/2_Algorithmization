package by.epam.careers.part4;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**На плоскости заданы своими координатами n точек. Написать
 * метод(методы), определяющие, между какими из пар точек самое
 * большое расстояние. Указание. Координаты точек занести в массив.*/
public class Task4 {
    public static void main(String[] args) {
        int[][] arr = {{10, 5}, {10, 20}, {5, 7}, {28, 14}, {36, 7}, {73, 64}};
        int[] value = MaxDistance(arr);
        System.out.println("Максимальное расстояние между точками (" + arr[value[0]][0] + ", " +  arr[value[0]][1] +
                ") и (" + arr[value[1]][0] + ", " +  arr[value[1]][1] + ")");
    }

    public static int[] MaxDistance(int[][] arr) {
        int maxDistance = 0;
        int x, y;
        int[] value = new int[3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int distance = (int) sqrt(pow((arr[i][0] - arr[j][0]), 2) + pow((arr[i][1] - arr[j][1]), 2));
                if (distance > maxDistance) {
                    maxDistance = distance;
                    value[0] = i;
                    value[1] = j;
                    value[2] = maxDistance;

                }
            }

        }
        return value;
    }
}
