package by.epam.careers.part1;

import static java.lang.Math.*;

import java.io.*;

/**Дан  массив  действительных  чисел,  размерность  которого  N.
 Подсчитать,  сколько  в  нем  отрицательных, положительных и нулевых элементов.*/
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] arr = new int[N];
        int p = 0, m = 0, z = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (random() * 1000 - 500);
            if(arr[i] > 0) {
                p++;
            } else if(arr[i] < 0) {
                m++;
            } else {
                z++;
            }
        }
        System.out.println("Количество положительных чисел: " + p);
        System.out.println("Количество отрицательных чисел: " + m);
        System.out.println("Количество нулей: " + z);
    }
}
