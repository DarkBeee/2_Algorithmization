package by.epam.careers.part4;

import static java.lang.Math.*;

/**Натуральное число, в записи которого n цифр, называется числом Армстронга,
 * если сумма его цифр, возведённая в степень n, равна самому числу. Найти
 * все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.*/
public class Task14 {
    public static void main(String[] args) {
        primeNumber(10_000_000);
    }
    public static void primeNumber(int k) {
        System.out.println("Числа Армстронга от 1 до " + k + ":");
        for (int i = 1; i < k; i++) {
            int power = 0;
            int x = i;
            while (x != 0) {
                x = x / 10;
                power++;
            }
            x = i;
            int sum = 0;
            while (x != 0) {
                sum += pow(x % 10, power);
                x = x / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
