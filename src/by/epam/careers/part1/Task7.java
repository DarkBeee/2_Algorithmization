package by.epam.careers.part1;

import static java.lang.Math.*;

/**Даны действительные числа a1, a2,..., an. Найти max(a1 + a2n, a2 + a3n-1,..., an + an+1.*/
public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (random() * 100 - 50);
        }
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] > max) {
                max = arr[i] + arr[i + 1];
            }
        }
        System.out.println("max = " + max);
    }
}
