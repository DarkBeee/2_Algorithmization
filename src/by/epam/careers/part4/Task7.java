package by.epam.careers.part4;

/**Написать метод(методы) для вычисления суммы факториалов
 * всех нечётных чисел от 1 до 9.*/
public class Task7 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println("Сумма факториалов = " + factorial(arr));

    }
    public static int factorial(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int fact = 1;
            for (int j = 1; j <= arr[i]; j++) {
                fact = fact * j;
            }
            sum = sum + fact;
        }
        return sum;
    }
}
