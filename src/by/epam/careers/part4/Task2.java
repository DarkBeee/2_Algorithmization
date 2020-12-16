package by.epam.careers.part4;

/**Написать метод(методы) для нахождения наибольшего
 * общего делителя четырёх натуральных чисел.*/
public class Task2 {
    public static void main(String[] args) {
        System.out.println(searchDivider(searchDivider(searchDivider(54, 96), 48), 42));
    }
    public static int searchDivider(int m, int n) {
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
            return 2 * searchDivider(m / 2, n / 2);
        }
        if (m % 2 == 0 && n % 2 != 0) {
            return searchDivider(m / 2, n);
        }
        if (m % 2 != 0 && n % 2 == 0) {
            return searchDivider(m, n / 2);
        }
        if (m % 2 != 0 && n % 2 != 0 && n > m) {
            return searchDivider((n - m) / 2, m);
        }
        if (m % 2 != 0 && n % 2 != 0 && n < m) {
            return searchDivider((m - n) / 2, n);
        }
        return -1;
    }
}
