package by.epam.careers.part4;

/**Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего
 * общего кратного двух натуральных чисел: НОК(A, B) = A * B / НОД(A, B).*/
public class Task1 {
    public static void main(String[] args) {
        System.out.println(searchGreatestCommonDivider(1000, 100));
        System.out.println(searchLeastCommonMultiple(83, 89));
    }
    public static int searchLeastCommonMultiple(int a, int b) {
        return a * b / searchGreatestCommonDivider(a, b);
    }
    public static int searchGreatestCommonDivider(int m, int n) {
        if (m == 0 || m == n) {
            return n;
        }
        if (n == 0) {
            return m;
        }
        if (m == 1 || n == 1) {
            return 1;
        }
        if (m % 2 == 0 && n % 2 == 0) {
            return 2 * searchGreatestCommonDivider(m / 2, n / 2);
        }
        if (m % 2 == 0 && n % 2 != 0) {
            return searchGreatestCommonDivider(m / 2, n);
        }
        if (m % 2 != 0 && n % 2 == 0) {
            return searchGreatestCommonDivider(m, n / 2);
        }
        if (m % 2 != 0 && n % 2 != 0 && n > m) {
            return searchGreatestCommonDivider((n - m) / 2, m);
        }
        if (m % 2 != 0 && n % 2 != 0 && n < m) {
            return searchGreatestCommonDivider((m - n) / 2, n);
        }
        return -1;
    }
}
