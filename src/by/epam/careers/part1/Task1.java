package by.epam.careers.part1;

import java.io.*;

/**В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K.*/
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[100];
        int k = Integer.parseInt(reader.readLine());
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if(arr[i] % k == 0) {
                sum += arr[i];
            }
        }
        System.out.println("sum = " + sum);
    }
}
