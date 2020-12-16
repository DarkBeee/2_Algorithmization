package by.epam.careers.part4;

/**Даны натуральные числа K и N. Написать метод(методы) формирования
 * массива A, элементами которого являются числа, сумма цифр которых
 * равна K и которые не больше N.*/
public class Task12 {
    public static void main(String[] args) {
        int[] arr = createArray(5627, 15);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    public static int[] createArray(int k, int n) {
        int sum = 0;
        int length = 0;
        while (sum != k) {
            int i = n;
            for (; i > 0; i--) {
                if (sum + i <= k) {
                    sum = sum + i;
                    length++;
                }
            }
            if (i == 0) { i = n; }
        }

        int[] arr = new int[length];
        sum = 0;
        while (sum != k) {
            int i = n;
            for (; i > 0; i--) {
                if (sum + i <= k) {
                    arr[length - 1] = i;
                    sum = sum + i;
                    length--;
                }
            }
            if (i == 0) { i = n; }
        }
        return arr;
    }
}
