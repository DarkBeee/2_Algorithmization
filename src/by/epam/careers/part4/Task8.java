package by.epam.careers.part4;

/**Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3];
 * D[3] + D[4] + D[5]; D[4] + D[5] + D[6]. Пояснение. Составить
 * метод(методы) для вычисления суммы трёх последовательно
 * расположенных элементов массива с номерами от k до m.*/
public class Task8 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 19, 15, 18};
        int k = 1;
        int m = 3;
        System.out.println("Сумма трёх элементов от " + k +
                " до " + m + " = " + sumThirdNumber(arr, k, m));
    }
    public static int sumThirdNumber(int[] arr, int k, int m) {
        int sum = 0;
        for (int i = k - 1; i < m; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
